package com.gupao.jay.pattern.proxy.imitatejdkdynamic;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @Author JAY
 * @Date 2019/5/26 14:38
 * @Description TODO
 **/
public class JNClassLoader extends ClassLoader{

    private File classPathFile;
    public JNClassLoader(){
        String classPath = JNClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }


    @Override
    public Class findClass(String name) {
        String className = JNClassLoader.class.getPackage().getName() + "." + name;
        if(classPathFile  != null){
            File classFile = new File(classPathFile,name.replaceAll("\\.","/") + ".class");
            if(classFile.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try{
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte [] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff)) != -1){
                        out.write(buff,0,len);
                    }
                    return defineClass(className,out.toByteArray(),0,out.size());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

        return null;
    }
}
