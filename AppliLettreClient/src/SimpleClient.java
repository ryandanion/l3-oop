
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;



public class SimpleClient {
	
	static Socket socketOfClient = null;
	static ObjectOutputStream  os = null;
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
		if(continuer) {
			
		 // Write data to the output stream of the Client Socket.
		os = new ObjectOutputStream(socketOfClient.getOutputStream());
 	   Scanner sc = new Scanner(System.in);
 	   System.out.println("Caractère client en attente :");
 	   String caractere = sc.nextLine();

 		 os.writeObject(caractere);
 		 os.flush();
 	  
		}else {
			System.exit(0);
		}
     
	}

	

	public static void call() throws ClassNotFoundException {

       try {
           
           // Read data sent from the server.
           // By reading the input stream of the Client Socket.
    	   
    	   
           // Create output stream at the client (to send data to the server)
           
           
           // Input stream at Client (Receive data from the server).
       
    	   is = new ObjectInputStream(socketOfClient.getInputStream());
    	   String responseLine = (String) is.readObject();
    	   Interface.traiterReponseServeur(responseLine);
    	   
       } catch (UnknownHostException e) {
           System.err.println("Trying to connect to unknown host: " + e);
       } catch (IOException e) {
           System.err.println("IOException:  " + e);
       }
   }

}