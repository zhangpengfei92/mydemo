package com.zpf;

import com.zpf.volatiles.MyData;

import java.util.concurrent.atomic.AtomicInteger;

public class Deadlock {

    public static void main(String[] args) {
        AtomicInteger num = new AtomicInteger(2019);

        MyData myData=new MyData();

        new Thread(() -> System.out.println(Thread.currentThread().getName()+"--"+myData.num)).start();

        boolean b = num.compareAndSet(myData.getNum(), 1);

        if (b) {
            num.set(2018);
        }

        System.out.println("num = " + myData.num);
    }

}
