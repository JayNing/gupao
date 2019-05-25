package com.gupao.jay.pattern.singleton.register;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author JAY
 * @Date 2019/5/25 15:17
 * @Description 容器式单例
 **/
public class ContainerSingleton {
    private ContainerSingleton(){}

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className){
        synchronized (ioc){
            if (!ioc.containsKey(className)){
                try {
                    Object instance = Class.forName(className).newInstance();
                    ioc.put(className,instance);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return ioc.get(className);
        }
    }
}
