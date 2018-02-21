package com.george.testone.collection;

import com.george.testone.dataBase.ConnectToDataBase;
import com.george.testone.dataBase.DbQuery;
import com.george.testone.entity.Customer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerCollection {

    private ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();

    public ObservableList<Customer> getList(){
        return customerObservableList;
    }

    public void addCustomer(Customer customer){
        customerObservableList.add(customer);
    }

    public void init(){
        try{
            ResultSet rs = new DbQuery().stringQuery("SELECT " +
                    "  customer.id, " +
                    "  customer.first_name, " +
                    "  customer.family_name, " +
                    "  customer.mobile_number " +
                    "FROM " +
                    "  public.customer");
            while (rs.next()){
                System.out.println(rs.getLong("id"));
                System.out.println(rs.getString("first_name"));
                Customer customer = new Customer();
                customer.setId(rs.getLong("id"));
                customer.setFirstName(rs.getString("first_name"));
                customer.setFamilyName(rs.getString("family_name"));
                customer.setMobileNumber(rs.getString("mobile_number"));
                customerObservableList.add(customer);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
