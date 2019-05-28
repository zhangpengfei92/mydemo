package com.zpf.io;

import java.io.*;

/**
 *	InputStreamReader，转换流：字节-->字符
 *	功能：使用readLine方法读取键盘数据，一读读一行。
 *
 *		键盘--字节流读取
 *		InputStream in = System.in;
 *
 *		BufferedReader中有readLine方法。但是是字符流缓冲区对象，可以包装字符流
 *
 *		键盘录入流--readLine()
 *		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
 */
public class InputOutStreamDemo {

    public static void main(String[] args) {
        inputSteamTest();
    }

    private static void inputSteamTest() {
        //键盘
        InputStream in = System.in;
        //字符流
        InputStreamReader isr = new InputStreamReader(in);
        //进行处理流装饰
        BufferedReader bufr = new BufferedReader(isr);
        //输出流
        PrintStream ps =null;
        try {
            ps = new PrintStream(new FileOutputStream("D:\\myfile\\hello.txt"));
            String line = null;
            while ((line=bufr.readLine())!=null){
                if(line.indexOf("helloworld")>0){
                    line.replace("helloworld","hello".toUpperCase());
                }


                System.out.println(line.toUpperCase());
                ps.print(line.toUpperCase());
                ps.flush();
                System.out.println(line.indexOf("stop"));
                if(line.indexOf("stop")>-1){
                    ps.close();
                    System.out.println("线程停止");
                  //  Thread.currentThread().interrupt();
                   // System.exit(0);
                   // break;
                   // System.out.println("线程停止失败");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (null != ps) {
                ps.close();
            }
            try {
                if (null != in) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(null!=isr){
                    isr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
