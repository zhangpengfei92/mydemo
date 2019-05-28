package com.zpf.volatiles;

import java.util.concurrent.TimeUnit;

public class VolatileTest {

    public static void main(String[] args) {
        MyData myData=new MyData();

        new Thread(() ->{
            System.out.println(Thread.currentThread().getName()+"\t come in");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myData.num60();
            System.out.println(Thread.currentThread().getName()+"\t update num value :"+myData.num);
        }, "AAAA").start();

        while (myData.num == 1){

        }
        System.out.println(Thread.currentThread().getName()+"\t mission is over --->myData num = "+myData.num);

    }
}
