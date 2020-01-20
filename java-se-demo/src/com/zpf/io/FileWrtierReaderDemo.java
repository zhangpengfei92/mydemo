package com.zpf.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文本数据--字符流
 */
public class FileWrtierReaderDemo {

    public static void main(String[] args) {

        //fileWrtier();
        fileReader();
    }

    private static void fileReader() {
        FileReader fileReader=null;
        try {
            fileReader=new FileReader("D:\\myfile\\a.txt");
            int num =0;
            while ((num=fileReader.read())!=-1){
                System.out.print(  (char)num);
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

    }

    private static void fileWrtier() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("D:\\myfile\\hello.txt");

            if(fileWriter!=null){
                fileWriter.write("hello world");
                fileWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fileWriter!=null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
