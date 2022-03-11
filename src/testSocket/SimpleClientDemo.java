package testSocket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SimpleClientDemo {
	
	static Socket socketOfClient = null;
	static BufferedWriter os = null;
	static BufferedReader is = null;
	
	public static void init() {
	
		final String serverHost = "localhost";
		  try {
			
	           // Send a request to connect to the server is listening
	           // on machine 'localhost' port 9999.
	           socketOfClient = new Socket(serverHost, 9999);

	           // Create output stream at the client (to send data to the server)
	           os = new BufferedWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));


	           // Input stream at Client (Receive data from the server).
	           is = new BufferedReader(new InputStreamReader(socketOfClient.getInputStream()));

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
 	   Scanner sc = new Scanner(System.in);
 	   System.out.println("message client en attente...");
       os.write(sc.next());

        // End of line
        os.newLine();

        // Flush data.
        os.flush();  
     
	}

	

	public static void call() {

       try {
           
           // Read data sent from the server.
           // By reading the input stream of the Client Socket.
           String responseLine;
           if ((responseLine = is.readLine()) != null) {
        	   
               System.out.println("Server: " + responseLine);
               if (responseLine.indexOf("OK") != -1) {
         
               }
           }

       } catch (UnknownHostException e) {
           System.err.println("Trying to connect to unknown host: " + e);
       } catch (IOException e) {
           System.err.println("IOException:  " + e);
       }
   }

}