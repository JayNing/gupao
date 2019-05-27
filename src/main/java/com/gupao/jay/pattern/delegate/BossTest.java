package com.gupao.jay.pattern.delegate;

/**
 * @Author JAY
 * @Date 2019/5/27 21:51
 * @Description TODO
 **/
public class BossTest {
    public static void main(String[] args) {
        new Boss(new Leader(), "程序员");
    }
}
