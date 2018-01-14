package com.george.testone.dataBase;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) {
//        String query = "SELECT * FROM test";
        String query = "SELECT id, role FROM test WHERE role = 'admin'";
        ResultSet resultSet = new DbQuery().stringQuery(query);
        try {
//            System.out.println(String.valueOf(resultSet));
            while(resultSet.next()){
                System.out.print(resultSet.getInt("id")  +" ");
//                System.out.print(resultSet.getString("login") + " ");
//                System.out.print(resultSet.getString("password") + " ");
                System.out.println(resultSet.getString("role") + " ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
