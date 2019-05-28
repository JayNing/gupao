package com.gupao.jay.pattern.template;

/**
 * @Author JAY
 * @Date 2019/5/28 22:26
 * @Description TODO
 **/
public class HttpModel extends DatahubTaskTemplate {

    @Override
    protected void createProducer() {
        System.out.println("创建HTTP方式生产者");
    }

    @Override
    protected void createConsumer() {
        System.out.println("创建HTTP方式消费者");
    }
}
