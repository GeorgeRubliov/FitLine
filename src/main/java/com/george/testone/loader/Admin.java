/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.george.testone.loader;

import com.george.testone.settings.BaseSettings;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author George
 */
public class Admin extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/admin.fxml"));
        primaryStage.setTitle("Admin");
        Parent parent = (Parent)loader.load();
        parent.getStylesheets().add(Login.class.getResource("/styles/"+BaseSettings.style+".css").toExternalForm());
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();
        
    }
    
}
