package com.dbcontext;

import java.sql.*;

public class DbConnection {

    private static Connection conn;

    public static Connection getConnection() {
        if (DbConnection.conn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost;databaseName=DU1;"
                        + "user=sa;"
                        + "password=123456;"
                        + "encrypt=true;trustServerCertificate=true;"
                );
                System.out.println("Connect Expect");
                return conn;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("False");
            }
        } else {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Loi close");
            }

        }
        return conn;
    }

}
