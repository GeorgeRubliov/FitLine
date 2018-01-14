package com.george.testone.loader;

import com.george.testone.loader.Login;
import com.george.testone.settings.BaseSettings;
//import com.project.fitline.settings.BaseSettings;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FirstSettings extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FirstSetting.fxml"));
        primaryStage.setTitle("Settings");
        Parent parent = (Parent)loader.load();
        parent.getStylesheets().add(Login.class.getResource("/styles/"+ BaseSettings.style+".css").toExternalForm());
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();

    }
}
