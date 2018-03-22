package com.george.testone.loader;

import com.george.testone.settings.BaseSettings;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CustomerLoader extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Customer.fxml"));
        primaryStage.setTitle("Customer");
        Parent parent = (Parent)loader.load();
        parent.getStylesheets().add(Login.class.getResource("/styles/" + BaseSettings.style+".css").toExternalForm());
        primaryStage.setResizable(true);
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();
    }

}
