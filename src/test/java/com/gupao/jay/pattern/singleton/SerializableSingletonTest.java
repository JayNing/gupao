package com.gupao.jay.pattern.singleton;

import com.gupao.jay.pattern.singleton.serializable.SerializableSingleton;

import java.io.*;

/**
 * @Author JAY
 * @Date 2019/5/25 14:46
 * @Description TODO
 **/
public class SerializableSingletonTest {
    public static void main(String[] args) {

        SerializableSingleton s1 = null;
        SerializableSingleton s2 = SerializableSingleton.getInstance();

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("SerializableSingleton.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s2);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("SerializableSingleton.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            s1 = (SerializableSingleton) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
