package com.gupao.jay.pattern.singleton.register;

/**
 * @Author JAY
 * @Date 2019/5/25 14:59
 * @Description 枚举注册式单例
 **/
public enum  EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private EnumSingleton(){}

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
