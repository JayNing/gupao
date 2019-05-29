package com.gupao.jay.pattern.adapter;

import java.sql.Connection;

public class DatabaseAdapter extends OracleDatabase implements IDatabase {

    public Connection createConnection(String username, String password, String ip_port, String datasourceName) {
        return super.getConnection();
    }

    public void closeConnection(Connection connection) {
        super.close();
    }
}
