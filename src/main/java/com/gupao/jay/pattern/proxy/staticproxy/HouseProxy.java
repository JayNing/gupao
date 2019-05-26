package com.gupao.jay.pattern.proxy.staticproxy;

/**
 * @Author JAY
 * @Date 2019/5/26 13:58
 * @Description TODO
 **/
public class HouseProxy {

    private Person person;

    public HouseProxy(Person person){
        this.person = person;
    }

    public void buyHouse(){
        this.person.buyHouse();
    }

}
