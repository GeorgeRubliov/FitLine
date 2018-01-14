/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.george.testone.controller;

import com.george.testone.collection.ClientCollection;
import com.george.testone.entity.Clients;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 *
 * @author George
 */
public class Operators{

    private ClientCollection list = new ClientCollection();

    @FXML
    private TableView<Clients> table;

    @FXML
    private TableColumn<Clients, Long> id;

    @FXML
    private TableColumn<Clients, String> name;

    @FXML
    private TableColumn<Clients, String> coache;

    @FXML
    private TableColumn<Clients, String> timeIn;


    @FXML
    private void initialize(){

        id.setCellValueFactory(new PropertyValueFactory<Clients, Long>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Clients, String>("name"));
        coache.setCellValueFactory(new PropertyValueFactory<Clients, String>("coache"));
        timeIn.setCellValueFactory(new PropertyValueFactory<Clients, String>("timeIn"));
        list.fileTestData();
        table.setItems(list.getClientsList());

    }

    private void event(ActionEvent actionEvent){
        Object source = actionEvent.getSource();
        if(!(source instanceof Button)){
            return;
        }
        Button button = (Button) source;
//        Clients selectedClient = (Clients) list.getClientsList().get
    }

}
