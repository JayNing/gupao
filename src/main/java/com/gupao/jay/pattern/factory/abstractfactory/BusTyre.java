package com.gupao.jay.pattern.factory.abstractfactory;

/**
 * @Author JAY
 * @Date 2019/5/22 22:37
 * @Description 公交轮胎
 **/
public class BusTyre implements Tyre {
    @Override
    public String getTyreType() {
        return "busTyre";
    }
}
