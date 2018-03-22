package com.george.testone;

import com.george.testone.loader.Login;
import com.george.testone.settings.BaseSettings;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File(BaseSettings.nameOfSetingFile));
		} catch (FileNotFoundException e) {

				BaseSettings.defaultSettings();
		}

		/**
		 * Start Login Application
		 */
		Login.launch(Login.class, args);
	}
}
