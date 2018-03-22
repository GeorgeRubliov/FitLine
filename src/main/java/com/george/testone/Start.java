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

public class Start {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File(BaseSettings.nameOfSetingFile));
		} catch (FileNotFoundException e) {
			System.out.println("Error");
				BaseSettings.defaultSettings();
		}

		/**
		 * Start Login Application
		 */
		Login.launch(Login.class, args);
	}
}
