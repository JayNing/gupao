package com.gupao.jay.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @Author JAY
 * @Date 2019/6/2 9:11
 * @Description TODO
 **/
public class GuavaTest {
    public static void main(String[] args) {
        Question question = new Question();
        question.setUserName("JayNing");
        question.setContent("如何阅读spring源码？");

        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");

        EventBus eventBus = new EventBus();
        eventBus.register(tom);
        eventBus.register(mic);
        eventBus.post(question);
    }
}
