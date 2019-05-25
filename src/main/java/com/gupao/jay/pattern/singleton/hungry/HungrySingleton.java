package com.gupao.jay.pattern.singleton.hungry;

/**
 * @Author JAY
 * @Date 2019/5/25 14:06
 * @Description 饿汉式单例
 **/
public class HungrySingleton {

    private HungrySingleton(){}

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
