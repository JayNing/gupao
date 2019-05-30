package com.gupao.jay.pattern.decorate;

/**
 * @Author JAY
 * @Date 2019/5/30 20:00
 * @Description 拍照功能
 **/
public class PhotoPhoneDecorator extends PhoneDecorator {

    public PhotoPhoneDecorator(IPhone iPhone) {
        super(iPhone);
    }

    @Override
    public void doSomething() {

    }

    @Override
    public double getPrice() {
        return super.getPrice() + 50;
    }

    @Override
    public void function() {
//        super.function();
        doSomething();
        System.out.println("新增了拍照功能");
    }
}
