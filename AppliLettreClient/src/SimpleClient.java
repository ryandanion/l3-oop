
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;



public class SimpleClient {
	
	static Socket socketOfClient = null;
	static ObjectOutputStream os = null;
	static ObjectInputStream is = null;
	static boolean continuer = true;
	
	public static void init() {
	
		final String serverHost = "localhost";
		  try {
			
	           // Send a request to connect to the server is listening
	           // on machine 'localhost' port 9999.
	           socketOfClient = new Socket(serverHost, 9999);
	       	
	           
	           
	       } catch (UnknownHostException e) {
	           System.err.println("Hôte inconnu " + serverHost);
	           return;
	       } catch (IOException e) {
	           System.err.println("IOException " + serverHost);
	           return;
	       }
	}
	
	
	public static void envoiMessage(String caractere) throws IOException {			
		 // Write data to the output stream of the Client Socket.
		os = new ObjectOutputStream(socketOfClient.getOutputStream());

			 		 os.writeObject(caractere);
			 		 os.flush();
	}

	

	public static void call() throws ClassNotFoundException {

       try {
    	   is = new ObjectInputStream(socketOfClient.getInputStream());
    	   String responseLine = (String) is.readObject();
    	   ControllerClient.afficherReponseServeur(responseLine);
    	   continuer = ControllerClient.verifierReponseServeur(responseLine);
 
    	   
       } catch (UnknownHostException e) {
           System.err.println("Hôte inconnu " + e);
       } catch (IOException e) {
           System.err.println("IOException:  " + e);
       }
   }

}