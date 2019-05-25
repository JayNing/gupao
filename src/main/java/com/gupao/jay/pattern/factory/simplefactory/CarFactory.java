package com.gupao.jay.pattern.factory.simplefactory;

/**
 * @Author JAY
 * @Date 2019/5/22 22:11
 * @Description 汽车工厂类
 **/
public class CarFactory {

    public static Car getInstanceByType(String type){
        if ("truck".equals(type)){
            return new Truck();
        }else if ("bus".equals(type)){
            return new Bus();
        }else if ("motor".equals(type)){
            return new Motor();
        }
        return null;
    }

    public static Car getInstanceByName(String name){
        try {
            Class<Car> carClass = (Class<Car>) Class.forName(name);
            return carClass.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static <T> T getInstanceByClass(Class<T> clazz){
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
