package com.zpf.io;

import java.io.*;

/**
 * 使用字节流缓冲区对象完成复制文件操作
 */
public class BuffererdCopyDemo {

    public static void main(String[] args) {
        buffererdCopy();
    }

    private static void buffererdCopy() {
        FileWriter fw = null;
        FileReader fr = null;
        BufferedReader br = null;
        BufferedWriter bw =  null;

        try {
            fw = new FileWriter("D:\\myfile\\c.txt");
            fr = new FileReader("D:\\myfile\\idea快捷键.txt");
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            String readLine="";
            while ((readLine=br.readLine())!=null){
                bw.write(new String(readLine.getBytes("ISO-8859-1"),"UTF-8"));
                bw.flush();
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (null!=fr) {
                    fr.close();
                }
                if (null!=br) {
                    br.close();
                }

                if (null!=bw) {
                    bw.close();
                }

                if (null!=fw) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
