package com.gupao.jay.pattern.prototype.deep;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.util.List;

/**
 * @Author JAY
 * @Date 2019/5/25 19:36
 * @Description 机器人
 **/
public class Robot implements Cloneable, Serializable {
    private String name;
    private RobotFunction robotFunction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RobotFunction getRobotFunction() {
        return robotFunction;
    }

    public void setRobotFunction(RobotFunction robotFunction) {
        this.robotFunction = robotFunction;
    }

    @Override
    protected Robot clone(){
//        return shallowClone();
        return deepClone();
    }

    private Robot deepClone() {
        try{
            ByteArrayOutputStream bs = new ByteArrayOutputStream();
            ObjectOutputStream os = new ObjectOutputStream(bs);
            os.writeObject(this);

            ByteArrayInputStream bi = new ByteArrayInputStream(bs.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            Robot object = (Robot) oi.readObject();
            os.close();
            bs.close();
            oi.close();
            bi.close();
            return object;
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    private Robot shallowClone(){
        Robot robot = new Robot();
        robot.setName(this.name);
        robot.setRobotFunction(this.robotFunction);
        return robot;
    }
}
