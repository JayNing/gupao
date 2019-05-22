package com.gupao.jay.factory.abstractfactory;

/**
 * @Author JAY
 * @Date 2019/5/22 22:39
 * @Description TODO
 **/
public class TruckFactory implements IFactory {
    @Override
    public Car createCar() {
        return new Truck();
    }

    @Override
    public Tyre createTyre() {
        return new TruckTyre();
    }
}
