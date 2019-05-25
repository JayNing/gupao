package com.gupao.jay.pattern.singleton;

import com.gupao.jay.pattern.singleton.register.EnumSingleton;
import com.gupao.jay.pattern.singleton.serializable.SerializableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @Author JAY
 * @Date 2019/5/25 14:46
 * @Description 枚举式单例
 **/
public class EnumSingletonTest {
    public static void main(String[] args) {

        //测试通过反序列化破坏枚举单例
//        testSeriableDestroySingleton();
        //测试通过反射破坏枚举单例
        testReflectDestroySingleton();
        //结论：无论哪种方式，都无法破坏枚举式单例
    }

    private static void testReflectDestroySingleton() {
        Class<EnumSingleton> aClass = EnumSingleton.class;
        try {
            Constructor<EnumSingleton> declaredConstructor = aClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            EnumSingleton enumSingleton = declaredConstructor.newInstance();
            System.out.println(enumSingleton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testSeriableDestroySingleton() {
        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();
        s2.setData(new Object());

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s2);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            s1 = (EnumSingleton) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(s1.getData());
            System.out.println(s2.getData());
            System.out.println(s1.getData() == s2.getData());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
