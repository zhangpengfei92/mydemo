package com.zpf.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) {
        try {
            //创建套接字，并且指定目标主机，以及端口号
            Socket socket = new Socket("127.0.0.1",8090);

            //获取连接管道中的输出流OutputStream
            OutputStream outputStream = socket.getOutputStream();

            //使用流进行输出
            outputStream.write("TCP COME ON".getBytes());

            //接收回馈信息
            byte[] bytes = new byte[1024];
            InputStream inputStream = socket.getInputStream();
            int len = inputStream.read(bytes);
            String str = new String(bytes, 0, len);
            System.out.println(str);
            outputStream.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
