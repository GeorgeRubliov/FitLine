package com.george.testone.collection;

import com.george.testone.dataBase.DbQuery;
import com.george.testone.entity.Customer;
import com.george.testone.interfaces.Collectiones;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * this class was write for manage connection OperatorsController with the data base and the Customer's entity.
 *
 * @author George
 */

public class CustomerCollection implements Collectiones<Customer> {

    private ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();

    @Override
    public void init(){
        makeLit();
    }

    private void makeLit() {
        try {
            ResultSet rs = new DbQuery().stringQuery("SELECT * FROM public.customer");
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getLong("id"));
                customer.setSecondName(rs.getString("second_name"));
                customer.setFirstName(rs.getString("first_name"));
                customer.setFamilyName(rs.getString("family_name"));
                customer.setMobileNumber(rs.getString("mobile_number"));
                customer.setEmail(rs.getString("email"));
                customer.setPhoto(rs.getString("photo"));
                customerObservableList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    @Override
    public void add(Customer customer) {
        customerObservableList.add(customer);
    }

    @Override
    public ObservableList<Customer> getList(){
        return customerObservableList;
    }

    public void refreshCustomerObservableList() {
        try{
            customerObservableList.clear();
        }catch (Exception e){
            System.out.println("clear");
        }
        makeLit();
    }
}
