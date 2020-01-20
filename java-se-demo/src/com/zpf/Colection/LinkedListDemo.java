package com.zpf.Colection;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {

        LinkedList <String> linkedList = new LinkedList <>();

        linkedList.add("11111");
        linkedList.add("22222");
        linkedList.add("33333");
        linkedList.add("44444");
        linkedList.add("55555");
        linkedList.add("66666");
        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
