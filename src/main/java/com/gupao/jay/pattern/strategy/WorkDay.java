package com.gupao.jay.pattern.strategy;

/**
 * @Author JAY
 * @Date 2019/5/27 22:01
 * @Description TODO
 **/
public class WorkDay implements IPrice{
    @Override
    public double afterDiscount(double price) {
        return price * 0.8;
    }
}
