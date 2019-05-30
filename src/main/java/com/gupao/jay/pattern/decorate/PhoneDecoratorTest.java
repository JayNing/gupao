package com.gupao.jay.pattern.decorate;

/**
 * @Author JAY
 * @Date 2019/5/30 20:06
 * @Description TODO
 **/
public class PhoneDecoratorTest {
    public static void main(String[] args) {
        //设计一款手机
        //含有基础功能---打电话
        IPhone phone = new PhoneDecorator(new BasePhone());
        phone.function();
        System.out.println("基础功能的价格 ： " + phone.getPrice());
        //添加拍照功能
        phone = new PhotoPhoneDecorator(phone);
        phone.function();
        System.out.println("拍照功能的价格 ： " + phone.getPrice());
        //添加游戏功能
        phone = new GamePhoneDecorator(phone);
        phone.function();
        System.out.println("游戏功能的价格 ： " + phone.getPrice());
        //因为又添加了一个摄像头，所以再增加一个拍照功能
//        phone = new PhotoPhoneDecorator(phone);
//        phone.function();
//        System.out.println("双摄像头功能的价格 ： " + phone.getPrice());

    }
}
