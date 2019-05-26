package com.gupao.jay.pattern.proxy.jdkdynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author JAY
 * @Date 2019/5/26 14:04
 * @Description 课程销售代理
 **/
public class CourseProxy implements InvocationHandler {

    private Object target;

    public Object getInstance(Object object){
        this.target = object;
        Class<?> aClass = object.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }
}
