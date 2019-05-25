package com.gupao.jay.pattern.singleton;

import com.gupao.jay.pattern.singleton.hungry.HungrySingleton;

/**
 * @Author JAY
 * @Date 2019/5/25 14:08
 * @Description TODO
 **/
public class HungrySingletonTest {
    public static void main(String[] args) {

        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance2 == instance);

    }
}
