package com.gupao.jay.factory.factorymethod;

/**
 * @Author JAY
 * @Date 2019/5/22 22:11
 * @Description 摩托车
 **/
public class Motor implements Car {
    @Override
    public String getCarType() {
        return "摩托车";
    }
}
