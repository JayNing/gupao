package com.gupao.jay.factory.factorymethod;

import com.gupao.jay.factory.Bus;
import com.gupao.jay.factory.Car;

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
