package com.zpf.demo;

import java.util.Random;

public class sj {


    public static void main(String[] args) {
        Random ra =new Random();
        String [] names = {"熊","卢","阳","朱","飞","吴"};

        System.out.println(names[ra.nextInt(6)]);
    }

}
