package com.gupao.jay.pattern.observer.jdk;

/**
 * @Author JAY
 * @Date 2019/6/2 8:41
 * @Description 排队的号码
 **/
public class NumberModel {

    private int number;
    private String deskType;

    public NumberModel(int number, String deskType) {
        this.number = number;
        this.deskType = deskType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDeskType() {
        return deskType;
    }

    public void setDeskType(String deskType) {
        this.deskType = deskType;
    }

    @Override
    public String toString() {
        return "NumberModel{" +
                "number=" + number +
                ", deskType='" + deskType + '\'' +
                '}';
    }
}
