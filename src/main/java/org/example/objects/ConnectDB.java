package org.example.objects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private static final String dbUrl = "jdbc:mariadb://localhost/videosplus";
    private static final String dbUser = "12345";
    private static final String dbPassword = "123456";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, dbUser, dbPassword);
    }
}
