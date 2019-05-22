package com.gupao.jay.factory.abstractfactory;

/**
 * @Author JAY
 * @Date 2019/5/22 22:37
 * @Description 卡车轮胎
 **/
public class TruckTyre implements Tyre {
    @Override
    public String getTyreType() {
        return "truckTyre";
    }
}
