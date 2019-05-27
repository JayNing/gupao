package com.gupao.jay.pattern.strategy;

import com.sun.org.apache.regexp.internal.RE;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author JAY
 * @Date 2019/5/27 22:05
 * @Description 打折策略
 **/
public class DiscountStrategy {

    public static final String HOLIDAY = "holiday";
    public static final String WORKDAY = "workday";
    public static final String VIPDAY = "vipday";
    public static final String WEEKEND = "weekend";
    public static final String DEFAULT = WORKDAY;

    private static Map<String, IPrice> discountMap = new HashMap<>();

    static {
        discountMap.put(HOLIDAY,new Holiday());
        discountMap.put(WORKDAY,new WorkDay());
        discountMap.put(VIPDAY,new VIPDay());
        discountMap.put(WEEKEND,new Weekend());
    }

    public static IPrice getDiscountType(String type){
        if (!discountMap.containsKey(type)){
            return discountMap.get(DEFAULT);
        }
        return discountMap.get(type);
    }

}
