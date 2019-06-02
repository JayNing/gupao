package com.gupao.jay.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author JAY
 * @Date 2019/6/2 8:40
 * @Description 等待的顾客
 **/
public class Consumer implements Observer {

    public Consumer(int number) {
        this.number = number;
    }

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void update(Observable o, Object arg) {
        NumberModel numberModel = (NumberModel) arg;
        if (numberModel.getNumber() != this.number){
            System.out.println("号码不匹配，继续等待。。。。");
            return;
        }
        System.out.println("排到我们了，前往" + numberModel.getDeskType() + "用餐");
    }
}
