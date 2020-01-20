package com.zpf.Colection;

import java.util.HashMap;
import java.util.Hashtable;

public class Hashmap_demo {

    public static void main(String[] args) {

        Hashtable<Object, Object> hashtable = new Hashtable<>();
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put(null,"lisi");
        Object put = hashtable.put(null, "");
        System.out.println(put);
        System.out.println();


    }
}
