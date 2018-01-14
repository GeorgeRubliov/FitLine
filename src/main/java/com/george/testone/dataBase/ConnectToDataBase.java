package com.george.testone.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectToDataBase {

    Connection connection;

    public Connection connect(){
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String url = "jdbc:postgresql://localhost:5433/fltest";
        Properties properties = new Properties();
        properties.put("user","george");
        properties.put("password","1");
        try {
            checkConnection();
            connection = DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void checkConnection(){
        try {
            if(connection == null)return;
            if(!connection.isClosed()) {
                System.out.println("connected.");
            }else{
                System.out.println("no connection");}
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
