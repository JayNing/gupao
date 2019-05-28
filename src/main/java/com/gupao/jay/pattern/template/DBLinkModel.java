package com.gupao.jay.pattern.template;

/**
 * @Author JAY
 * @Date 2019/5/28 22:27
 * @Description TODO
 **/
public class DBLinkModel extends DatahubTaskTemplate {

    @Override
    protected void createProducer() {
        System.out.println("创建DBLink方式生产者");
    }

    @Override
    protected void createConsumer() {
        System.out.println("创建DBLink方式消费者");
    }
}
