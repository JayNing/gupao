package com.gupao.jay.pattern.factory.abstractfactory;

/**
 * @Author JAY
 * @Date 2019/5/22 22:37
 * @Description 摩托车轮胎
 **/
public class MotorTyre implements Tyre {
    @Override
    public String getTyreType() {
        return "motorTyre";
    }
}
