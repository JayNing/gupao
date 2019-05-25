package com.gupao.jay.pattern.singleton.lazy;

/**
 * @Author JAY
 * @Date 2019/5/25 14:22
 * @Description 静态内部类实现单例
 **/
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){}

    public static LazyInnerClassSingleton getInstance(){
        return InnerClass.lazy;
    }

    static class InnerClass{
        private static final LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }

}
