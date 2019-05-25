package com.gupao.jay.pattern.prototype.simple;

import java.util.Arrays;

/**
 * @Author JAY
 * @Date 2019/5/25 19:21
 * @Description 浅克隆测试
 **/
public class SimplePrototypeTest {
    public static void main(String[] args) {
        DuoLiSheep duoLiSheep = new DuoLiSheep();
        duoLiSheep.setAge(11);
        duoLiSheep.setName("多利");
        duoLiSheep.setWeight(12.9);
        duoLiSheep.setDesc(Arrays.asList("漂亮"));
        System.out.println("原对象中的引用类型地址值：" + duoLiSheep.getDesc());
        DuoLiSheep clone = duoLiSheep.clone();
        System.out.println("克隆对象中的引用类型地址值：" + clone.getDesc());
        System.out.println("对象地址比较：" + (duoLiSheep.getDesc() == clone.getDesc()));
        /**
         * 从测试结果看出 desc 的引用地址是相同的，意味着复制的不是值，而是引用的地址。
         * 这 样 的 话 ， 如 果 我 们 修 改 任 意 一 个 对 象 中 的 属 性 值 ， duoLiSheep 和
         * clone 的 desc 值都会改变。这就是我们常说的浅克隆。只是完整
         * 复制了值类型数据，没有赋值引用对象。换言之，所有的引用对象仍然指向原来的对象，
         * 显然不是我们想要的结果。下面我们来看深度克隆继续改造。
         */

    }
}
