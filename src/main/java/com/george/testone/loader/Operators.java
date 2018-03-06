package com.george.testone.loader;

//import com.project.fitline.settings.BaseSettings;
import com.george.testone.settings.BaseSettings;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Operators extends Application{

    private FXMLLoader loader = new FXMLLoader();
    private Parent parent;

    @Override
    public void start(Stage primaryStage) throws Exception {
        try{
            loader = new FXMLLoader(getClass().getResource("/fxml/Operators.fxml"));
            primaryStage.setTitle("Operator");
            parent = (Parent)loader.load();
            parent.getStylesheets().add(Login.class.getResource("/styles/"+BaseSettings.style+".css").toExternalForm());
            primaryStage.setResizable(true);
            primaryStage.setScene(new Scene(parent));
            primaryStage.show();
        }catch (Exception e){
            System.out.println(e);
        }

    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
