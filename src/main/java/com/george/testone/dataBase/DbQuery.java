package com.george.testone.dataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbQuery {
    ResultSet rs = null;
    Statement st = null;
    Connection connection;
    public ResultSet stringQuery(String query){
        ConnectToDataBase dataBase = new ConnectToDataBase();
        connection = dataBase.connect();
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rs;
    }
}
