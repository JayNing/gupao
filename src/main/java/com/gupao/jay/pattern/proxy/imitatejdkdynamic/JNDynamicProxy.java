package com.gupao.jay.pattern.proxy.imitatejdkdynamic;

import java.lang.reflect.Method;

/**
 * @Author JAY
 * @Date 2019/5/26 14:15
 * @Description TODO
 **/
public class JNDynamicProxy implements JNInvocationHandler {

    private Object target;

    public Object getInstance(Object obj){
        this.target = obj;
        Class<?> aClass = obj.getClass();
        return JNProxy.newProxyInstance(new JNClassLoader(), aClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }
}
