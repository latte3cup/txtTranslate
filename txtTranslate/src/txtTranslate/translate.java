package txtTranslate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class translate extends Papago  {
	public static void main(String[] args) {

		String projectDirectory = System.getProperty("user.dir");
		File input = new File(projectDirectory + "/Input");

		File[] files = input.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isFile()) {
					System.out.println(file.getName());
				}
			}
		} else {
			System.out.println("There is no file");
		}
		
		
		String text="";
		Papago papago = new Papago();
		papago.connection(text);
		
		

	
		

	}

}
