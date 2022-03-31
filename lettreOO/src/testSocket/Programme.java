package testSocket;

import java.io.IOException;

import Utils.Properties;

public class Programme {
	 public static void main(String args[]) throws IOException, ClassNotFoundException {
			 Properties properties = new Properties("en");
			 System.out.println(properties.getValeur("titre"));
			 System.out.println(properties.getValeur("consigne")); 
		 
		
		SimpleServerProgram.init();
		SimpleClientDemo.init();
		SimpleServerProgram.acceptUser();
		
		 while(true) {
		SimpleClientDemo.envoiMessage();
		SimpleServerProgram.call();
		SimpleClientDemo.call();

		}
		
		
		
	 }

}
