package com.gupao.jay.pattern.proxy.imitatejdkdynamic;

import com.gupao.jay.pattern.proxy.jdkdynamic.Learner;
import com.gupao.jay.pattern.proxy.jdkdynamic.Student;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author JAY
 * @Date 2019/5/26 14:46
 * @Description TODO
 **/
public class JNJdkDynamicProxyTest {
    public static void main(String[] args) {
        Learner learner = (Learner) new JNDynamicProxy().getInstance(new Student());
        learner.learnCourse();

    }
}
