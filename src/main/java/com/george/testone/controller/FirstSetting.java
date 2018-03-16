package com.george.testone.controller;


//import com.project.fitline.settings.BaseSettings;
import com.george.testone.settings.BaseSettings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.json.Json;
import javax.json.JsonObject;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FirstSetting implements Initializable{

    @FXML
    private Button cancele;

    @FXML
    private TextField adress;

    @FXML
    private TextField login;

    @FXML
    private TextField style;

    @FXML
    private PasswordField password;

    @FXML
    private TextField port;

    @FXML
    private TextField dataBaseName;

    public void cancelePresset(ActionEvent actionEvent) {
        Stage stage = (Stage) cancele.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        adress.setText(BaseSettings.adress);
        login.setText(BaseSettings.login);
        style.setText(BaseSettings.style);
        port.setText(BaseSettings.port);
        dataBaseName.setText(BaseSettings.dataBaseName);

    }

    public void applyAction(ActionEvent actionEvent) {
        BaseSettings.password = password.getText();
        BaseSettings.dataBaseName = dataBaseName.getText();
        BaseSettings.style = style.getText();
        BaseSettings.login = login.getText();
        BaseSettings.adress = adress.getText();
        BaseSettings.port = port.getText();
        try {
            FileWriter fw = new FileWriter(BaseSettings.nameOfSetingFile);
            JsonObject jo = Json.createObjectBuilder()
                    .add("address",adress.getText())
                    .add("port", port.getText())
                    .add("DataBaseName", dataBaseName.getText())
                    .add("login", login.getText())
                    .add("password", password.getText())
                    .add("style", style.getText())
                    .build();
            fw.write(String.valueOf(jo));
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        cancele.setText("Exit");
    }
}
