package Databas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnvändareInserts {
    private String url = "jdbc:mysql://localhost/";
    private static final String USERNAME = "Jepsson";
    private static final String PASSWORD = "Ol@f4lif3";
    private PreparedStatement selectUser;
    private Connection connection;
    private String databaseName;

    public Connection getConnection() {
        try {
            databaseName = "biblioteket";
            url += databaseName;
            connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.exit(1);
        }
        return connection;
    }
}
