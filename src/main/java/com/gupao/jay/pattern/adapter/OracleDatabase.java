package com.gupao.jay.pattern.adapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDatabase {

    public Connection getConnection(){
        System.out.println("获取到oracle数据库连接。。。。。。。。。。");
        try {
            return DriverManager.getConnection( "123456", "127.0.0.1:3306", "local");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void close(){
        System.out.println("关闭oracle连接");
    }

}
