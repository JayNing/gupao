package com.gupao.jay.pattern.adapter;

import java.sql.Connection;

/**
 * 数据库接口
 */
public interface IDatabase {

    Connection createConnection(String username, String password, String ip_port, String datasourceName);

    void closeConnection(Connection connection);

}
