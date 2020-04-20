package com.zpf.Decorator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    /**
     * 测试装饰者模式
     * @param args
     * 装饰设计在 Java/IO 中的实际应用  BufferedReader 装饰流
     */
    public static void main(String[] args) {
        Phone phone = new PhoneImpl();
        Iphone iphone = new Iphone(phone);
        iphone.call();
    }
}
