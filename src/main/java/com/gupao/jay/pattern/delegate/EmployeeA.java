package com.gupao.jay.pattern.delegate;

/**
 * @Author JAY
 * @Date 2019/5/27 21:43
 * @Description TODO
 **/
public class EmployeeA implements IEmployee {

    @Override
    public void doing() {
        System.out.println("我是程序员。。");
    }
}
