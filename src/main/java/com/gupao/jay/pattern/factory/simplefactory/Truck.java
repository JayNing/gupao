package com.gupao.jay.pattern.factory.simplefactory;

/**
 * @Author JAY
 * @Date 2019/5/22 22:08
 * @Description 卡车类
 **/
public class Truck implements Car {
    @Override
    public String getCarType() {
        return "卡车";
    }
}
