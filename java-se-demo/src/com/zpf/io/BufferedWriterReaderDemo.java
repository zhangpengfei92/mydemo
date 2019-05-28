package com.zpf.io;

import java.io.*;

/**
 *	字符流的缓冲区对象,提高字符流读写效率的。
 *	处理流，起到功能上的包装，装饰作用
 *		BufferedWriter
 *		BufferedReader
 *
 *
 *	BufferedWriter
 *			void newLine()  写入一个行分隔符。
 *
 * class BufferedWriter extends Writer{
 * 		Writer out;
 * 		private char cb[];
 private static int defaultCharBufferSize = 8192;


 * 		public BufferedWriter(Writer out){//Writer out = new FileWriter();
 * 			this.out = out;
 * 		}
 *
 * 		//自己的write方法起到了高效的作用
 * 		//其实底层在使用out的write方法
 * 		public void write(char[] cbuf, int off, int len)throws IOException{
 * 			//高效率代码进行装饰
 * 			out.write(cbus,off,len);
 * 		}
 * }
 *
 */
public class BufferedWriterReaderDemo {

    public static void main(String[] args) {
        //bufferedWriter();
        bufferedReader();
    }

    private static void bufferedReader() {
        FileReader reader = null ;
        BufferedReader br = null ;
        try {
            reader = new FileReader("D:\\myfile\\b.txt");
            br = new BufferedReader(reader);
            String line= null;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(null!=reader){
                    reader.close();
                }
                if(null!=br){
                    br.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private static void bufferedWriter() {
        FileWriter writer = null;
        BufferedWriter bf = null;

        try {
            writer = new FileWriter("D:\\myfile\\b.txt");
            bf = new BufferedWriter(writer);
            bf.write("为中华之崛起而读书，");
            bf.newLine();
            bf.write("周恩来");
            bf.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(null!=writer){
                    writer.close();
                }
                if(null!=bf){
                    bf.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
