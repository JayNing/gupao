package com.gupao.jay.pattern.prototype.simple;

import java.util.List;

/**
 * @Author JAY
 * @Date 2019/5/25 19:20
 * @Description 克隆羊多利
 **/
public class DuoLiSheep implements Cloneable{

    private int age;
    private String name;
    private double weight;
    private List<String> desc;

    public List<String> getDesc() {
        return desc;
    }

    public void setDesc(List<String> desc) {
        this.desc = desc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    protected DuoLiSheep clone(){
        DuoLiSheep duoLiSheep = new DuoLiSheep();
        duoLiSheep.setWeight(this.weight);
        duoLiSheep.setAge(this.age);
        duoLiSheep.setName(this.name);
        duoLiSheep.setDesc(this.desc);
        return duoLiSheep;
    }
}
