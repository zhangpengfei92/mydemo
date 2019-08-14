package com.zpf.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8090);
            Socket accept = serverSocket.accept();
            System.out.println("一个客户端连接");
            InputStream inputStream = accept.getInputStream();
            byte[] bytes = new byte[1024];
            int len = inputStream.read(bytes);
            String str = new String(bytes, 0, len);

            //给客户端发送回馈消息
            OutputStream outputStream = accept.getOutputStream();
            outputStream.write(("服务器"+str).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
