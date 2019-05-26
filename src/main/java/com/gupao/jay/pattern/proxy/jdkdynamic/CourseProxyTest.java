package com.gupao.jay.pattern.proxy.jdkdynamic;

/**
 * @Author JAY
 * @Date 2019/5/26 14:08
 * @Description TODO
 **/
public class CourseProxyTest {
    public static void main(String[] args) {
        Object instance = new CourseProxy().getInstance(new Student());
        try {
            instance.getClass().getMethod("learnCourse",null).invoke(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
