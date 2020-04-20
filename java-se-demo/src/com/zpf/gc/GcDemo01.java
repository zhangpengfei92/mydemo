package com.zpf.gc;

//测试gc
public class GcDemo01 {

    public static void main(String[] args) throws InterruptedException {
        Boolean flag = true;
        long startTime = System.currentTimeMillis();
        int count = 0;
        Object o = new Object();
        System.out.println(o.toString());
        System.gc();
        //Thread.sleep(100000);

        while(flag){
            count++;
            Thread.sleep(10000);
            if (o == null){
                flag = false;
                System.out.println("垃圾对象被回收");
                long endTime = System.currentTimeMillis();
                System.out.println((endTime-startTime)/1000+"秒");
            }
            System.out.println(count);
        }
    }


}
