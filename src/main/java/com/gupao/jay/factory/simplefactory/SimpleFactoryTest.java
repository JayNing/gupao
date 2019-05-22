package com.gupao.jay.factory.simplefactory;

/**
 * @Author JAY
 * @Date 2019/5/22 22:17
 * @Description 简单工厂测试类
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {

        Car bus = CarFactory.getInstanceByType("bus");
        Car truck = CarFactory.getInstanceByName("com.gupao.jay.factory.Truck");
        Car motor = CarFactory.getInstanceByClass(Motor.class);
        System.out.println(bus.getCarType());
        System.out.println(truck.getCarType());
        System.out.println(motor.getCarType());
    }
}
