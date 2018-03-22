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

/**
 * This class for manage login.fxml GUI.
 * @author George
 */

public class login{

    @FXML
    TextField log;

    @FXML
    PasswordField password;

    /**
     * this method opens a GUI for making setting for tune connection to the data base and chose style.
     * @param actionEvent
     */
    public void openSettings(ActionEvent actionEvent) {
        FirstSettings fs = new FirstSettings();
        try {
            fs.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * ActionEvent for the loginPressed button and this event check the login and password in the data base
     * and return the roe of the user if this user is in the data base and have right for using this system.
     * @param actionEvent
     */

    public void loginPressed(ActionEvent actionEvent) {
        checkQuery();
    }

    private void checkQuery(){
        try {
            ResultSet rs = new DbQuery().stringQuery("SELECT roles.name FROM public.login, public.roles WHERE roles.id = login.id_roles AND login.name = '"+log.getText()+"' AND login.password = '"+password.getText()+"'");
            String role = null;
            while (rs.next()){
                role = rs.getString("name");
                switch ((String)role){
                    case "ADMIN":{
                        Stage stage = (Stage) log.getScene().getWindow();
                        stage.close();
                        Admin op = new Admin();
                        op.start(new Stage());
                        break;
                    }
                    case "OPERATOR":{
                        Stage stage = (Stage) log.getScene().getWindow();
                        stage.close();
                        Operators op = new Operators();
                        op.start(new Stage());
                        break;
                    }
                    case "DIRECTOR":{
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
