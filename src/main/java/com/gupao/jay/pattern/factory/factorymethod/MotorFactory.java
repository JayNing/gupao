package com.gupao.jay.pattern.factory.factorymethod;

/**
 * @Author JAY
 * @Date 2019/5/22 22:25
 * @Description TODO
 **/
public class MotorFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Motor();
    }
}
