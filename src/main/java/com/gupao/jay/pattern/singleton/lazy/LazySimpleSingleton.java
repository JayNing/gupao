package com.gupao.jay.pattern.singleton.lazy;

/**
 * @Author JAY
 * @Date 2019/5/25 14:10
 * @Description 简单懒汉式单例
 **/
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySingleton;

    private LazySimpleSingleton(){}

    public static LazySimpleSingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySimpleSingleton();
        }
        return lazySingleton;
    }

}
