package com.application.MBBusBaseSpring.jdbc;

import com.application.MBBusBaseSpring.entity.Route;

import java.sql.*;

public class TestJdbc {

    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/mbbusbase?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "root";

        try {

            System.out.println("Connecting to database: " + jdbcUrl);

            Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);

            System.out.println("Connection Success!!!");


        } catch (Exception exc) {
            exc.printStackTrace();
        }

        Route route = new Route();

        try(Connection connection = DriverManager.getConnection(jdbcUrl, user, password);)
        {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM `route` WHERE id = ?");
            preparedStatement.setInt(1, 1);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                route.setId(resultSet.getInt("id"));
                route.setName(resultSet.getString("name"));

            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        System.out.println(route.getName());
    }

}
