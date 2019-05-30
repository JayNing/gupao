package com.gupao.jay.pattern.decorate;

/**
 * @Author JAY
 * @Date 2019/5/30 20:00
 * @Description 游戏功能
 **/
public class GamePhoneDecorator extends PhoneDecorator {

    public GamePhoneDecorator(IPhone iPhone) {
        super(iPhone);
    }

    @Override
    public void doSomething() {

    }

    @Override
    public double getPrice() {
        return super.getPrice() + 100;
    }

    @Override
    public void function() {
//        super.function();
        doSomething();
        System.out.println("新增了游戏功能");
    }
}
