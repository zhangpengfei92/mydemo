package com.zpf.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class test {

    int count= 10;


    public static void main(String[] args) {
        /*Test2 test = new Test2();
        test.count1();
        test.count2();
        test.count3();
        test.count2();*/

        test4(5);

    }


    public static void test1(){

        //num.getAndAdd(1);
    }

    public static void test2() {
        String b1 ="true";
        String b2 ="true ";
        if(b1 == b2.trim()){
            System.out.println("a");
        }else {
            System.out.println("b");
        }
    }

    public static void test3() {
        for (int i = 0; i <3 ; i++) {
            for (int j = 3; j >=0 ; j--) {
                if(i==j)
                   continue;
                System.out.println("i="+i+"   j="+j);

            }
        }
    }

    public static void test4(int n) {
        int num = 1;
       //int [] num = {1,2,4,7,11,16,22};
        for (int i = 0; i <n; i++) {
            num = num+i;
            System.out.println(num);
        }
    }


}
