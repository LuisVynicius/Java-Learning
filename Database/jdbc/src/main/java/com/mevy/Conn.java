package com.mevy;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest", "admin", "1234");
            return connection;
        } catch (Exception e) {
            throw new DatabaseException(e.getMessage());
        }
    }

}
