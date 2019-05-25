package com.gupao.jay.pattern.singleton.serializable;

import java.io.Serializable;

/**
 * @Author JAY
 * @Date 2019/5/25 14:44
 * @Description 测试序列化破解单例
 **/
public class SerializableSingleton implements Serializable {
    private SerializableSingleton(){}

    private static SerializableSingleton serializable;

    public static SerializableSingleton getInstance(){
        if (serializable == null){
            synchronized (SerializableSingleton.class){
                if (serializable == null){
                    serializable = new SerializableSingleton();
                }
            }
        }
        return serializable;
    }

    //通过重写readResolve方法，可以防止反序列化破解单例
    private Object readResolve(){
        return serializable;
    }
}
