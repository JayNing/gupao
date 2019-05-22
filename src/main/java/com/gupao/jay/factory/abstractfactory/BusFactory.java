package com.gupao.jay.factory.abstractfactory;

import com.gupao.jay.factory.Bus;
import com.gupao.jay.factory.Car;

/**
 * @Author JAY
 * @Date 2019/5/22 22:33
 * @Description TODO
 **/
public class BusFactory implements IFactory {
    @Override
    public Car createCar() {
        return new Bus();
    }

    @Override
    public Tyre createTyre() {
        return new BusTyre();
    }
}
