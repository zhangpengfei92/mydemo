package com.zpf.Decorator;
//定义Iphone类继承Phone，并且对PhoneImpl的功能进行优化
public class Iphone  implements Phone{
    private Phone phone;

    /**
     *
     * @param targer--被装饰的对象
     */
    public Iphone(Phone targer){
        this.phone=targer;
    }
    @Override
    public void call() {
        System.out.println("铃声响了");
        phone.call();
    }
}
