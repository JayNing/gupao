package com.gupao.jay.pattern.adapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * mysql连接数据库
 */
public class SQLServerDatabase implements IDatabase {

    public Connection createConnection(String username, String password, String ip_port, String datasourceName) {
        System.out.println("连接sqlserver数据库。。。。。。。。。。。。。。");
        String url = "jdbc:sqlserver://" + ip_port + ";databaseName=" + datasourceName;
        try {
            return DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void closeConnection(Connection connection) {
        System.out.println("关闭sqlserver数据库连接。。。。。。。。。。。。");
        try {
            if (connection != null){
                connection.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
