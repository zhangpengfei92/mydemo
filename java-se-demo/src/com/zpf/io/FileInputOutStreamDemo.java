package com.zpf.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流
 *OutputStream		InputStream
 *FileOutputStream	FileInputStream
 *BufferedOutputStream	BufferedInputStream
 */
public class FileInputOutStreamDemo {
    public static void main(String[] args) {
        fileOutStream();
       // fileInputStream();
      //  fileInputStreamByBuff();

    }

    private static void fileInputStreamByBuff() {
        FileInputStream fis = null;

        try {
            byte [] buf = new byte[1024*1024];
            fis = new FileInputStream("D:\\myfile\\诗歌.txt");
            int len =0;
            while ((len=fis.read(buf))!=-1){
                System.err.println(new String(buf,0,len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(null!=fis){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void fileInputStream() {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\myfile\\诗歌.txt");
            int num =0;
            while ((num=fis.read())!=-1){
                System.err.println(num);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(null!=fis){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void fileOutStream() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\myfile\\诗歌.txt",true);
            fos.write(("字节输出流输出了一首诗 ：桃花坞里桃花庵，桃花庵下桃花仙。\n" +
                    "桃花仙人种桃树，又摘桃花换酒钱。\n" +
                    "酒醒只在花前坐，酒醉还来花下眠。\n" +
                    "半醉半醒日复日，花落花开年复年。\n" +
                    "但愿老死花酒间，不愿鞠躬车马前。\n" +
                    "车尘马足富者趣，酒盏花枝贫者缘。\n" +
                    "若将富贵比贫贱，一在平地一在天。\n" +
                    "若将贫贱比车马，他得驱驰我得闲。\n" +
                    "别人笑我太疯癫，我笑他人看不穿。\n" +
                    "不见五陵豪杰墓，无花无酒锄作田。 ").getBytes());
            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(null!=fos){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
