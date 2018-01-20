package com.george.testone;

import com.george.testone.loader.Login;
import com.george.testone.settings.BaseSettings;

import javax.json.Json;
import javax.json.JsonObject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Start {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File(BaseSettings.nameOfSetingFile));

		} catch (FileNotFoundException e) {
			System.out.println("exeption");
			try {
				FileWriter fileWriter = new FileWriter("settings.json");
				JsonObject jsonObject = Json.createObjectBuilder()
						.add("address","localhost")
						.add("port","5433")
						.add("DataBaseName","fltest")
						.add("login","george")
						.add("password","1")
						.add("style","base")
						.build();

				fileWriter.write(String.valueOf(jsonObject));
				fileWriter.flush();
				System.out.println(jsonObject);
			} catch (IOException e1) {
				System.out.println(e1);
			}
		}
		Login.launch(Login.class, args);
	}
}
