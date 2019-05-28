package com.zpf.volatiles;


import java.util.Random;

public class MyData {

  public volatile int num = 1;

    public  void num60(){
       this.num=60;
    }

    public int getNum() {
        Random random = new Random(100000);
        while (1==1){
            return  random.nextInt();
        }
    }
}
