package com.gupao.jay.pattern.proxy.staticproxy;

/**
 * @Author JAY
 * @Date 2019/5/26 13:57
 * @Description TODO
 **/
public class Consumer implements Person {
    @Override
    public void buyHouse() {
        System.out.println("买120平以上的大房子");
    }
}
