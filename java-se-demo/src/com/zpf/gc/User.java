package com.zpf.gc;

public class User {
    private String name;

    public User(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("name :"+name +" finalize");
    }
}
