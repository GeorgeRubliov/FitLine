/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.george.testone.controller;

import com.george.testone.collection.CustomerCollection;
import com.george.testone.entity.Customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 *
 * @author George
 */
public class Operators{

    CustomerCollection customerCollection = new CustomerCollection();

    @FXML
    private TableView<Customer> table;
    @FXML
    private TableColumn<Customer, Long> id;
    @FXML
    private TableColumn<Customer, String> firstName;
    @FXML
    private TableColumn<Customer, String> familyName;
    @FXML
    private TableColumn<Customer, String> mobileNumber;

    @FXML
    private void initialize(){
        id.setCellValueFactory(new PropertyValueFactory<Customer, Long>("id"));
        firstName.setCellValueFactory(new PropertyValueFactory<Customer, String>("firstName"));
        familyName.setCellValueFactory(new PropertyValueFactory<Customer, String>("familyName"));
        mobileNumber.setCellValueFactory(new PropertyValueFactory<Customer, String>("mobileNumber"));
        customerCollection.init();
        table.setItems(customerCollection.getList());
    }

    private void event(ActionEvent actionEvent){
        Object source = actionEvent.getSource();
        if(!(source instanceof Button)){
            return;
        }
        Button button = (Button) source;
    }

}
