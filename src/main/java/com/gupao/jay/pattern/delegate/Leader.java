package com.gupao.jay.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author JAY
 * @Date 2019/5/27 21:41
 * @Description TODO
 **/
public class Leader {

    private static Map<String, IEmployee> handerMapping = new HashMap<>();

    static {
        handerMapping.put("程序员", new EmployeeA());
        handerMapping.put("设计师", new EmployeeB());
    }

    public void doing(String command) {
        if (!handerMapping.containsKey(command)){
            System.out.println("没有找到合适的员工");
        }
        handerMapping.get(command).doing();
    }
}
