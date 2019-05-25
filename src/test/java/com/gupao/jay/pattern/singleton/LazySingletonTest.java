package com.gupao.jay.pattern.singleton;

import com.gupao.jay.pattern.singleton.lazy.LazyDoubleCheckSingleton;

/**
 * @Author JAY
 * @Date 2019/5/25 14:12
 * @Description TODO
 **/
public class LazySingletonTest {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
                System.out.println(instance);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
                System.out.println(instance);
            }
        });
        t1.start();
        t2.start();
    }
}
