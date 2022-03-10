package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Properties {


	 private final Map<String, String> properties; 

	public Properties(String langue) {
		
		 this.properties = new HashMap<>();
		
		
		try (FileInputStream inputStream = new FileInputStream("C:\\Users\\Raphaël\\Desktop\\properties-"+langue+".csv")) {
			Scanner obj = new Scanner(inputStream);

			while (obj.hasNextLine()) {
				String data = obj.nextLine();
				String[] list = data.split(",");
				properties.put(list[0], list[1]);
			}
			
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getValeur(String clee) {
		return properties.get(clee);
	}

}
