package com.zpf.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CasDemo {
    public  static  void  main(String [] args){
        AtomicInteger num = new AtomicInteger(20);

        boolean b = num.compareAndSet(20, 2019);
        System.out.println(b+"----num="+num);

        boolean f = num.compareAndSet(20, 2020);

        System.out.println(f+"---num="+num);
    }
}
