package com.zpf.gc;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        User user = new User("Jim");

        new MyThread("myThread").start();

        System.gc(); // Jim将被回收


        Thread.sleep(9 * 1000); // 等待线程myThread执行完毕

        System.gc(); // myThread线程对象将被回收

        Thread.sleep(3 * 1000);

        while(user == null){
            System.out.println("自旋结束");
        }


    }
}
