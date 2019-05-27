package com.gupao.jay.pattern.strategy;

/**
 * @Author JAY
 * @Date 2019/5/27 22:10
 * @Description TODO
 **/
public class DiscountStrategyTest {
    public static void main(String[] args) {
        double afterDiscount = DiscountStrategy.getDiscountType(DiscountStrategy.WEEKEND).afterDiscount(100);
        System.out.println(afterDiscount);
    }
}
