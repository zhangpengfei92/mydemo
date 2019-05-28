package com.zpf.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 	打印流(只有写),为其他输出流添加了功能，使它们能够方便地打印各种数据值"表示形式"
 * 		"表示形式"--任何数据类型，使用打印流输出，数据都会变成String进行输出到目的地。
 * 				保证不了数据的原样性。
 * 		PrintStream(File,
 * 						OutputStream,
 * 						OutputStream out, boolean autoFlush
 * 						OutputStream out, boolean autoFlush, String encoding
 * 						String fileName)
 * 		PrintWriter
 *
 * 		=====================================
 * 		static InputStream in  “标准”输入流。 默认指键盘
 * 				static void setIn(InputStream in)  重新指定数据源
 *
 static PrintStream out “标准”输出流。  默认指控制台
 static void setOut(PrintStream out) 重新指定目的地
 */
public class PrintStreamDemo {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream("D:\\myfile\\hello.txt"));
            System.out.print("hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
