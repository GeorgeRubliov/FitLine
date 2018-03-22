package com.george.testone.settings;

import javax.json.Json;
import javax.json.JsonObject;
import java.io.FileWriter;
import java.io.IOException;
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

    public static void defaultSettings() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("settings.json");
            JsonObject jsonObject = Json.createObjectBuilder()
                    .add("address","localhost")
                    .add("port","5432")
                    .add("DataBaseName","fitline")
                    .add("login","fit")
                    .add("password","fit")
                    .add("style","base")
                    .build();

            fileWriter.write(String.valueOf(jsonObject));
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
