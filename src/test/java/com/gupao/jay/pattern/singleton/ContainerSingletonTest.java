package com.gupao.jay.pattern.singleton;

import com.gupao.jay.pattern.singleton.register.ContainerSingleton;

/**
 * @Author JAY
 * @Date 2019/5/25 15:23
 * @Description TODO
 **/
public class ContainerSingletonTest {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {
                    Object obj = ContainerSingleton.getBean("com.gupao.jay.pattern.singleton.Pojo");
                    System.out.println(System.currentTimeMillis() + ": " + obj);
                }
            }, 10,6);
            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - start) + " ms.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
