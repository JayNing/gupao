package com.gupao.jay.factory.factorymethod;

/**
 * @Author JAY
 * @Date 2019/5/22 22:26
 * @Description 工厂方法测试类
 **/
public class FactoryMethodTest {

    public static void main(String[] args) {
        CarFactory factory = new BusFactory();
        Car bus = factory.createCar();
        System.out.println(bus.getCarType());
    }

}
