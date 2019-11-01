package com.zpf.cas;

public class Test2 {
    int count= 10;
    public void count1(){
        int count = 9;
        System.out.println("count1="+count);
    }

    public void count2(){
        System.out.println("count2="+count);
    }

    public void count3(){
        System.out.println("count3="+getnum());
    }

    public int getnum(){
        return  count++;
    }
}
