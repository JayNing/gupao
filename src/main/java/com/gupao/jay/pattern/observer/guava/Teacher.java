package com.gupao.jay.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Author JAY
 * @Date 2019/6/2 9:05
 * @Description TODO
 **/
public class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void subscribe(Question question){
    //业务逻辑
        System.out.println(this.name + "老师，学生" + question.getUserName() + "向你提了一个问题，问题的内容是:" + question.getContent());
    }
}
