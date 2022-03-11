package testSocket;

import java.io.IOException;

public class Programme {
	 public static void main(String args[]) throws IOException {
		
	    System.out.println();
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
