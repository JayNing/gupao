package com.gupao.jay.pattern.template;

/**
 * @Author JAY
 * @Date 2019/5/28 22:29
 * @Description TODO
 **/
public class TemplateTest {
    public static void main(String[] args) {
        new HttpModel().createDatahubTask();
        new DBLinkModel().createDatahubTask();
        new WebserviceModel().createDatahubTask();
    }
}
