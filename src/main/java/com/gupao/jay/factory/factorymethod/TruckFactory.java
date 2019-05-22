package com.gupao.jay.factory.factorymethod;

import com.gupao.jay.factory.Car;
import com.gupao.jay.factory.Truck;

/**
 * @Author JAY
 * @Date 2019/5/22 22:25
 * @Description TODO
 **/
public class TruckFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Truck();
    }
}
