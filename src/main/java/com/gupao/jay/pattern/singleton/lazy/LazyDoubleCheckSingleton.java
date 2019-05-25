package com.gupao.jay.pattern.singleton.lazy;

/**
 * @Author JAY
 * @Date 2019/5/25 14:10
 * @Description 双重判断懒汉式单例
 **/
public class LazyDoubleCheckSingleton {

    //这里volatile很重要
    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        if (lazySingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazy指向刚分配的内存地址
                    //4.初次访问对象
                    //上述的2、3步指令执行顺序是不固定的，cpu争抢执行时间片段。如果想2、3步骤正常按照顺序执行，
                    // 则在上方设置私有变量时，添加volatile关键字
                }
            }
        }
        return lazySingleton;
    }

}
