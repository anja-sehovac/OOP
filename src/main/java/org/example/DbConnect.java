package org.example;
import java.sql.*;

public class DbConnect {
    public static void main(String[] args) throws SQLException {
        DbConnect db = new DbConnect();

        db.getTaskById(1);
    }

    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/CHANGE";
    private static final String USERNAME = "CHANGE";
    private static final String PASSWORD = "CHANGE";


    private Connection connection = null;


    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void getAllTasks() throws SQLException {
        Statement useStatement = this.connection.createStatement();
        useStatement.execute("USE lab3;");
        useStatement.close();

        PreparedStatement statement = this
                .connection
                .prepareStatement("SELECT * FROM tasks;");
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("task_description"));
            System.out.println(rs.getString("task_status"));
        }
    }

    public void getTaskById(int taskId) throws SQLException {
        Statement useStatement = this.connection.createStatement();
        useStatement.execute("USE lab3;");
        useStatement.close();

        PreparedStatement statement = this
                .connection
                .prepareStatement("SELECT * FROM tasks WHERE id = ?");
        statement.setInt(1, taskId);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("task_description"));
            System.out.println(rs.getString("task_status"));
        }
    }}

