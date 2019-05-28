package com.zpf.volatiles;

public class Test {
    public static void main(String[] args) {
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
