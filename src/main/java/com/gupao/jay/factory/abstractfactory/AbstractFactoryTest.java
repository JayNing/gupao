package com.gupao.jay.factory.abstractfactory;

/**
 * @Author JAY
 * @Date 2019/5/22 22:40
 * @Description TODO
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IFactory busFactory = new BusFactory();
        Car busFactoryCar = busFactory.createCar();
        Tyre busFactoryTyre = busFactory.createTyre();
        System.out.println(busFactoryCar.getCarType());
        System.out.println(busFactoryTyre.getTyreType());
    }
}
