package com.gupao.jay.pattern.proxy.cglibproxy;

/**
 * @Author JAY
 * @Date 2019/5/26 15:20
 * @Description TODO
 **/
public class CglibProxyTest {
    public static void main(String[] args) {
        Consumer instance = (Consumer)new CglibProxy().getInstance(Consumer.class);
        instance.buy();
    }
}
