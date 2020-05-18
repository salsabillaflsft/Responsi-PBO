package Model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class JavaDatabase {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/planner";
    static final String USER = "root";
    static final String PASS = "";

    private static Connection connection;

    public static Connection getConnection() {
        if(connection==null) {
            try {
                Class.forName(JDBC_DRIVER);
                connection = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
                System.out.println("Koneksi Berhasil");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.out.println("Koneksi Gagal");
            }
        }
        return connection;
    }
}
