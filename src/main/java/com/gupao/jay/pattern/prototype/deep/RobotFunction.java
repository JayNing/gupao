package com.gupao.jay.pattern.prototype.deep;

import java.io.Serializable;

/**
 * @Author JAY
 * @Date 2019/5/25 19:37
 * @Description 机器人的能力
 **/
public class RobotFunction implements Serializable {

    private String write;
    private String read;

    public String getWrite() {
        return write;
    }

    public void setWrite(String write) {
        this.write = write;
    }

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }

}
