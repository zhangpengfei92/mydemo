package com.zpf.volatiles;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String str11111 = String.valueOf(60.0);


        System.out.println(Integer.parseInt(str11111.substring(0,str11111.indexOf("."))));

        ArrayList <String> list = new ArrayList <>();
        for (int i = 0; i < 13; i++) {
            list.add(i+"a");
        }
        ArrayList <String> list2 = new ArrayList <>();
        list.forEach(j -> System.out.println(j));
        BigDecimal[] chu = chu(13, new BigDecimal(700000));
        System.out.println(list.size());
        System.out.println(chu.length);

        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i) + chu[i].toString());
        }
        list2.forEach(str -> System.out.println(str));
    }

    public static  BigDecimal  [] chu(Integer count,BigDecimal b){
        java.util.Random random=new java.util.Random();// 定义随机类
        int result=random.nextInt(count);// 返回[0,10)集合中的整数，注意不包括10


        BigDecimal d1 = b.divide(new BigDecimal(count),0,BigDecimal.ROUND_DOWN );
        BigDecimal d3 [] = new BigDecimal[count];
        for (int i = 0; i < count; i++) {
            d3[i] = d1;
        }
        d3[result] =d1.add(b.subtract(d1.multiply(new BigDecimal(count))));
        System.out.println("----------------------------");
        for (BigDecimal decimal : d3) {

            System.out.println(decimal);
        }
        System.out.println("----------------------------");
        return d3;
    }

    public  void AddAdd(){
        int i = 1;
        i = i++;
        int j = i++;
        int k = i+ ++i*i++;
        // ++i ++ ++
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        // int k = i(2)+ ++i(3)*i (3)
        System.out.println("k = " + k);
    }
}
