package com.gupao.jay.pattern.delegate;

/**
 * @Author JAY
 * @Date 2019/5/27 21:40
 * @Description TODO
 **/
public class Boss {

   public Boss(Leader leader, String command){
       leader.doing(command);
   }
}
