
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Properties {


	 private final Map<String, String> properties; 

	public Properties() {
		
		 this.properties = new HashMap<>();
		 String pwd = System.getProperty("user.dir");
	
		try (FileInputStream inputStream = new FileInputStream(pwd+"AppliLettreServeur/properties-"+Configuration.getLangue()+".csv")) {
			Scanner obj = new Scanner(inputStream);

			while (obj.hasNextLine()) {
				String data = obj.nextLine();
				String[] list = data.split(",");
				properties.put(list[0], list[1]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getValeur(String clee) {
		return properties.get(clee);
	}

}
