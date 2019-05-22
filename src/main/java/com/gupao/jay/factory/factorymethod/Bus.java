package com.gupao.jay.factory.factorymethod;

/**
 * @Author JAY
 * @Date 2019/5/22 22:10
 * @Description 公交
 **/
public class Bus implements Car {
    @Override
    public String getCarType() {
        return "公交";
    }
}
