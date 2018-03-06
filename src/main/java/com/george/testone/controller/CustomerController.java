package com.george.testone.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class CustomerController implements Serializable{


    @FXML
    private Button save;

    public void saveCustomer(ActionEvent actionEvent) {
        Stage stage = (Stage) save.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void initialize(){
    }

    public void abortToSaveCustomer(ActionEvent actionEvent) {
        Stage stage = (Stage) save.getScene().getWindow();
        stage.close();

    }

    public void addListener(final PropertyChangeListener listener){
    }


}
