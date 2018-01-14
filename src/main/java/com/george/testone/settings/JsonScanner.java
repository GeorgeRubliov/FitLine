package com.george.testone.settings;

import javax.json.Json;
import javax.json.stream.JsonParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class JsonScanner {

    private String nameOfSetingFile;

    public JsonScanner(String nameOfSetingFile) {
        this.nameOfSetingFile=nameOfSetingFile;

    }

    public List<String> scann(){
        List<String> list = new ArrayList<String>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(nameOfSetingFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        }catch (NoSuchElementException e){
            System.out.println(e);
        }
        String file = scanner.next();
        JsonParser parser = Json.createParser(new StringReader(file));
        while (parser.hasNext()){
            JsonParser.Event event = parser.next();
            switch (event){
                case VALUE_STRING:
                    list.add(parser.getString());
                    break;
            }
        }
        return list;
    }
}
