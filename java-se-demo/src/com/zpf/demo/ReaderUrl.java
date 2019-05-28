package com.zpf.demo;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ReaderUrl {

    public static void main(String[] args) {
        try {
            URL url = new URL("http\\://121.41.59.171:7080/uploadpath/img/");
            InputStream inputStream = url.openStream();
            byte[] bytes = new byte[2048];
            inputStream.read(bytes);
            String str = new String(bytes,"utf-8");
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
