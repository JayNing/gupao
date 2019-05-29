package com.gupao.jay.pattern.adapter;

import java.sql.Connection;

public class DatabaseAdapterTest {

    public static void main(String[] args) {
        IDatabase iDatabase = new MysqlDatabase();
        Connection connection = iDatabase.createConnection("root", "123456", "127.0.0.1:3306", "local");
        iDatabase.closeConnection(connection);

        IDatabase iDatabase1 = new DatabaseAdapter();
        Connection connection1 = iDatabase1.createConnection("root", "123456", "127.0.0.1:3306", "local");

        iDatabase1.closeConnection(connection1);
    }


}
