package com.gupao.jay.pattern.observer.jdk;

/**
 * @Author JAY
 * @Date 2019/6/2 8:55
 * @Description TODO
 **/
public class CallNumberSystemTest {

    public static void main(String[] args) {
        Consumer consumerA = new Consumer(10001);
        Consumer consumerB = new Consumer(10002);
        Consumer consumerC = new Consumer(10003);

        CallNumberSystem instance = CallNumberSystem.getInstance();
        instance.addObserver(consumerA);
        instance.addObserver(consumerB);
        instance.addObserver(consumerC);

        instance.notifyNumber(new NumberModel(10002,"小桌A11号"));
        
    }

}
