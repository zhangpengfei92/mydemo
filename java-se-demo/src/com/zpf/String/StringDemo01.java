package com.zpf.String;

import java.lang.reflect.Field;

/*
 *String的内容是不变的，
 * 只是str由原来指向"Hello"
 * 的内存地址转为指向"Hello
 * World"的内存地址而已，
 * 也就是说多开辟了一块
 * 内存区域给"Hello World"字符串。
 */
public class StringDemo01 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //test1();
        //test2();
        test3();
    }

    private static void test3() throws NoSuchFieldException, IllegalAccessException {
        String str = "hello world";
        System.out.println("原来的str:"+str);
        //通过反射拿到String类的属性value
        Field field = String.class.getDeclaredField("value");
        //改变value属性的访问权限
        field.setAccessible(true);
        //获取value的值
        char [] value = (char[]) field.get(str);
        value[5] ='_';
        System.out.println("新的str:"+str);
    }

    private static void test2() {
        /**
         * str1的地址：356573597
         * str2的地址：356573597
         */
        String str1 = "hello";
        String str2 = "hello";
        System.out.println("str1的地址："+System.identityHashCode(str1));
        System.out.println("str2的地址："+System.identityHashCode(str2));
        System.out.println(str1.equals(str2));
    }

    public static void test1(){
        /**
         * hello的地址：356573597
         * hello_world的地址：1735600054
         */
        String str = "hello";
        System.out.println("hello的地址："+System.identityHashCode(str));
        str = "hello_world";
        System.out.println("hello_world的地址："+System.identityHashCode(str));
    }
}
