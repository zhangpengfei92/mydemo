package com.zpf.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * static InputStream in  “标准”输入流。 默认指键盘
 * 		static void setIn(InputStream in)   重新分配“标准”输入流
 */
 public class SystemDemo {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("D:\\myfile\\hello.txt"));
            InputStream in = System.in;
            int num=0;
            while ((num=in.read())!=-1){
                System.out.print(( char)num);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
