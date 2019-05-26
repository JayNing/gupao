package com.gupao.jay.pattern.proxy.imitatejdkdynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author JAY
 * @Date 2019/5/26 14:15
 * @Description TODO
 **/
public interface JNInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
