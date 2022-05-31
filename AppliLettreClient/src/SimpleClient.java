
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
	           System.err.println("Don't know about host " + serverHost);
	           return;
	       } catch (IOException e) {
	           System.err.println("Couldn't get I/O for the connection to " + serverHost);
	           return;
	       }
	}
	
	
	public static void envoiMessage() throws IOException {			
		 // Write data to the output stream of the Client Socket.
		os = new ObjectOutputStream(socketOfClient.getOutputStream());
				  Scanner sc = new Scanner(System.in);
			 	   System.out.println("Caractère client en attente :");
			 	   String caractere = sc.nextLine();

			 		 os.writeObject(caractere);
			 		 os.flush();
	}

	

	public static void call() throws ClassNotFoundException {

       try {
    	   is = new ObjectInputStream(socketOfClient.getInputStream());
    	   String responseLine = (String) is.readObject();
    	   ControllerClient.AfficherReponseServeur(responseLine);
    	   continuer = ControllerClient.VerifierReponseServeur(responseLine);
 
    	   
       } catch (UnknownHostException e) {
           System.err.println("Trying to connect to unknown host: " + e);
       } catch (IOException e) {
           System.err.println("IOException:  " + e);
       }
   }

}