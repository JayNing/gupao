package com.gupao.jay.pattern.singleton;

import com.gupao.jay.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import com.gupao.jay.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @Author JAY
 * @Date 2019/5/25 14:28
 * @Description TODO
 **/
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
//        testLazyInnerClassSingleton();
        forceDestroySingleton();
    }

    private static void forceDestroySingleton() {
        //使用反射暴力破坏单例
        try {
            Class<?> clazz = Class.forName("com.gupao.jay.pattern.singleton.lazy.LazyInnerClassSingleton");
            //空参构造
            Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            //反射创建实例
            Object o1 = declaredConstructor.newInstance();
            //单例方法创建实例
            LazyInnerClassSingleton o2 = LazyInnerClassSingleton.getInstance();
            System.out.println(o1);
            System.out.println(o2);
            //发现地址不一致，说明反射方式创建了新的对象，破坏了单例对象的唯一性
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testLazyInnerClassSingleton() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
                System.out.println(instance);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
                System.out.println(instance);
            }
        });
        t1.start();
        t2.start();
    }
}
