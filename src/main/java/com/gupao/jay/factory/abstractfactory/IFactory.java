package com.gupao.jay.factory.abstractfactory;

/**
 * @Author JAY
 * @Date 2019/5/22 22:29
 * @Description 总工厂接口
 **/
public interface IFactory {

    /**
     * 生产汽车
     */

    public Car createCar();

    /**
     * 生产轮胎tyre
     */
    public Tyre createTyre();
}
