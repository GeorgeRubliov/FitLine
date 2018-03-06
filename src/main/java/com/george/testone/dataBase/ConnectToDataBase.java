package com.george.testone.dataBase;

import com.george.testone.settings.BaseSettings;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Class for connection to the chosen data base and return connection to data base.
 */

public class ConnectToDataBase {

    Connection connection;

    public Connection connect(){
        BaseSettings baseSettings = new BaseSettings();
        baseSettings.start();
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String url = "jdbc:postgresql://"+baseSettings.adress+":"+baseSettings.port+"/"+baseSettings.dataBaseName;
        Properties properties = new Properties();
        properties.put("user", baseSettings.login);
        properties.put("password", baseSettings.password);
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
