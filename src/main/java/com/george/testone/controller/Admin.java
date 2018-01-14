/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.george.testone.controller;

import com.george.testone.loader.Login;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author George
 */
public class Admin{
    
    @FXML
    BorderPane admin;

    public void close(ActionEvent actionEvent) {
        System.exit(0);
    }
    
    public void logOut(ActionEvent actionEvent) {
        try {
            Stage stage = (Stage) admin.getScene().getWindow();
            stage.close();
            Login  login = new Login();
            login.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
