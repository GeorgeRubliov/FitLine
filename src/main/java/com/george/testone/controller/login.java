package com.george.testone.controller;

import com.george.testone.dataBase.DbQuery;
import com.george.testone.loader.FirstSettings;
import com.george.testone.loader.Operators;
import com.george.testone.loader.Admin;
import com.george.testone.loader.Director;
import java.sql.ResultSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class login{

    @FXML
    TextField log;

    @FXML
    PasswordField password;

    public void openSettings(ActionEvent actionEvent) {
        FirstSettings fs = new FirstSettings();
        try {
            fs.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loginPressed(ActionEvent actionEvent) {
        checkQuery();
    }

    private void checkQuery(){
        try {
            ResultSet rs = new DbQuery().stringQuery("SELECT role.role " +
                    "  FROM " +
                    "  public.passwords, " +
                    "  public.role, " +
                    "  public.users " +
                    "  WHERE " +
                    "  users.passwords_id = passwords.id AND" +
                    "  users.role_id = role.id AND" +
                    "  users.login = '"+log.getText()+"' AND " +
                    "  passwords.password ='"+password.getText()+"'");
            String role = null;
            while (rs.next()){
                role = rs.getString("role");
                switch ((String)role){
                    case "admin":{
                        Stage stage = (Stage) log.getScene().getWindow();
                        stage.close();
                        Admin op = new Admin();
                        op.start(new Stage());
                        break;
                    }
                    case "operator":{
                        Stage stage = (Stage) log.getScene().getWindow();
                        stage.close();
                        Operators op = new Operators();
                        op.start(new Stage());
                        break;
                    }
                    case "director":{
                        Stage stage = (Stage) log.getScene().getWindow();
                        stage.close();
                        Director op = new Director();
                        op.start(new Stage());
                        break;
                    }
                }
            }
            if(role == null){
                System.out.println("error role");
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

    @FXML
    private void handleOnKeyReleased(KeyEvent event)
    {
        switch (event.getCode()){
            case ENTER:{
                checkQuery();
                break;
            }
        }
    }
}
