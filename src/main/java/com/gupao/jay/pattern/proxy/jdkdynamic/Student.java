package com.gupao.jay.pattern.proxy.jdkdynamic;

/**
 * @Author JAY
 * @Date 2019/5/26 14:01
 * @Description TODO
 **/
public class Student implements Learner{
    @Override
    public void learnCourse() {
        System.out.println("学习Java架构师课程");
    }
}
