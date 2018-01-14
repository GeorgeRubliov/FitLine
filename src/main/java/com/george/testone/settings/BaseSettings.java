package com.george.testone.settings;

import java.util.List;

public class BaseSettings {

    public static String adress = null;
    public static String login;
    public static String password;
    public static String style;
    public static String port;
    public static String dataBaseName;
    public static String nameOfSetingFile = "settings.json";

    public static void start(){
        JsonScanner jsonScanner = new JsonScanner(nameOfSetingFile);
        List<String> list = jsonScanner.scann();
        adress = list.get(0);
        port = list.get(1);
        dataBaseName = list.get(2);
        login = list.get(3);
        password = list.get(4);
        style = list.get(5);
    }

}
