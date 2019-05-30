package com.gupao.jay.pattern.decorate;

/**
 * @Author JAY
 * @Date 2019/5/30 19:48
 * @Description 基础电话
 **/
public class BasePhone implements IPhone {

    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public void function() {
        System.out.println("拥有了打电话功能");
    }
}
