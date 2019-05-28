package com.gupao.jay.pattern.template;

/**
 * @Author JAY
 * @Date 2019/5/28 22:20
 * @Description 数据交换任务
 **/
public abstract class DatahubTaskTemplate {

    public void createDatahubTask(){
        //1.创建主题
        this.createTopic();
        //2.创建消费者
        this.createConsumer();
        //3.创建生产者
        this.createProducer();
        //4.创建调度任务
        this.createScheduler();
    }

    protected void createScheduler(){
        System.out.println("创建调度任务");
    }

    protected abstract void createProducer();

    protected abstract void createConsumer();

    protected void createTopic(){
        System.out.println("创建主题");
    }

}
