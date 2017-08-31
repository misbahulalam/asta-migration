package com.cefalo.asta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author <a href="mailto:misbahulalam@gmail.com">Md. Misbahul Alam Chowdhury</a> on Aug 31, 2017
 * @since 1.0
 */
public class MySqlUtil {

    private static String HOST = System.getenv("ASTA_MYSQL_HOST");
    private static String SCHEMA = System.getenv("ASTA_MYSQL_SCHEMA");
    private static String USERNAME = System.getenv("ASTA_MYSQL_USERNAME");
    private static String PASSWORD = System.getenv("ASTA_MYSQL_PASSWORD");

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + SCHEMA + "?user=" + USERNAME + "&password=" + PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
