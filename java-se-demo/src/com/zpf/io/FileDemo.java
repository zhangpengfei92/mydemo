package com.zpf.io;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 删除指定文件夹
 */
public class FileDemo {
    static  int count = 0;
    public static void main(String[] args) {
        File file = new File("E:\\个人文档");
        getfiles(file);
        System.out.println("共计删除了"+count+"个文件");
        System.out.println(file.list().toString());
    }

    /**
     * E-SafeNet
     * @param file
     */
    public static void getfiles(File file) {
        File parentFile = null;
        if(count == 0){
            parentFile=file;
        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsolutePath());
            if(file1.isDirectory()){
                if(file1.list().length>0){
                    getfiles(file1);
                }else{
                    boolean a = file1.delete();
                    if (a) count++;
                    if(!file1.getParentFile().equals(parentFile)){
                        getfiles(file1.getParentFile());
                    }
                }
            }else{
                /*if(fileReader(file1).indexOf("E-SafeNet")>-1){*/
                    boolean b = file1.delete();
                    if (b) count++;
                /*}*/
            }
        }
    }

    private static String fileReader(File file) {
        FileReader fileReader=null;
        String string = "";
        try {
            fileReader=new FileReader(file);
            int num =0;
            while ((num=fileReader.read())!=-1){
                string = String.valueOf((char)num);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(fileReader!=null){

                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } ;
        }
        return string;
    }
}
