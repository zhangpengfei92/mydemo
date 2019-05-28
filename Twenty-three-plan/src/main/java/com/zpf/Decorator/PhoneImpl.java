package com.zpf.Decorator;

//定一个类PhoneImpl实现Phone接口
public class PhoneImpl implements Phone {

    @Override
    public void call() {
        System.out.println("接电话........");
    }
}
