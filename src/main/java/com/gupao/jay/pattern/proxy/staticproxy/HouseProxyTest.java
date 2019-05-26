package com.gupao.jay.pattern.proxy.staticproxy;

/**
 * @Author JAY
 * @Date 2019/5/26 13:59
 * @Description TODO
 **/
public class HouseProxyTest {
    public static void main(String[] args) {
        HouseProxy proxy = new HouseProxy(new Consumer());
        proxy.buyHouse();

    }
}
