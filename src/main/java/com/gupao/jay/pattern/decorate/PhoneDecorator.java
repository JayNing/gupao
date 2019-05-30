package com.gupao.jay.pattern.decorate;

/**
 * @Author JAY
 * @Date 2019/5/30 19:56
 * @Description TODO
 **/
public abstract class PhoneDecorator implements IPhone {

    IPhone iPhone;

    public PhoneDecorator(IPhone iPhone) {
        this.iPhone = iPhone;
    }

    public abstract void doSomething();

    @Override
    public double getPrice() {
        return this.iPhone.getPrice();
    }

    @Override
    public void function() {
        this.iPhone.function();
    }
}
