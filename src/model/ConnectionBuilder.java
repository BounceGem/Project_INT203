package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBuilder {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://pma.int203.phornlert.me", "59130500xxx", "#j3yQEA6");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("!" + ex);
        }
        return conn;
    }

    public static void main(String[] args) {
        Connection con = getConnection();
    }
}
