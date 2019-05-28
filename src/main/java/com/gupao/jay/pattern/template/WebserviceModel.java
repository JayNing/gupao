package com.gupao.jay.pattern.template;

/**
 * @Author JAY
 * @Date 2019/5/28 22:28
 * @Description TODO
 **/
public class WebserviceModel extends DatahubTaskTemplate {
    @Override
    protected void createProducer() {
        System.out.println("创建webservice方式生产者");
    }

    @Override
    protected void createConsumer() {
        System.out.println("创建webservice方式消费者");
    }
}
