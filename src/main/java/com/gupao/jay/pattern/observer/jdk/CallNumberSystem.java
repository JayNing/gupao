package com.gupao.jay.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.locks.Lock;

/**
 * @Author JAY
 * @Date 2019/6/2 8:42
 * @Description 叫号系统
 **/
public class CallNumberSystem extends Observable {

    private CallNumberSystem(){}

    private static CallNumberSystem callNumberSystem = null;

    public static CallNumberSystem getInstance(){
        if (callNumberSystem == null){
            synchronized (CallNumberSystem.class){
                if (callNumberSystem == null){
                    callNumberSystem = new CallNumberSystem();
                }
            }
        }
        return callNumberSystem;
    }

    public void notifyNumber(NumberModel numberModel){
        System.out.println("系统播报：请" + numberModel.getNumber() + "号顾客到" + numberModel.getDeskType() + "就餐！");
        setChanged();
        notifyObservers(numberModel);
    }
}
