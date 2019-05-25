package com.gupao.jay.pattern.factory.abstractfactory;

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
