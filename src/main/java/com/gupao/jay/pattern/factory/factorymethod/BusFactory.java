package com.gupao.jay.pattern.factory.factorymethod;

/**
 * @Author JAY
 * @Date 2019/5/22 22:24
 * @Description TODO
 **/
public class BusFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Bus();
    }
}
