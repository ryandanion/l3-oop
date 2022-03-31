package testSocket;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

import lettreOO.Caractere;
import lettreOO.LettreComposite;
import lettreOO.Mot;
import lettreOO.Phrase;

public class SimpleClientDemo {
	
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
 	  Caractere c;
 	  

 		  if(!caractere.equals("QUIT")) {
 			 if(caractere.length() != 0) {
 		 		  c = new Caractere(caractere.charAt(0));

 		 	  }else {
 		 		  c = new Caractere(' ');
 		 	  }
 			 
 			 os.writeObject(c);
 		 	   
 	        os.flush();  
 		  }else {
 			 Caractere q = new Caractere('Q');
 			 Caractere u = new Caractere('U');
 			 Caractere i = new Caractere('I');
 			 Caractere t = new Caractere('T');
 			 
 			 ArrayList<Caractere> list = new ArrayList<Caractere>();
 			 list.add(q);
 			 list.add(u);
 			 list.add(i);
 			 list.add(t);
 			 
 			 Mot m = new Mot(list);
 			 
 			 os.writeObject(m);
 		 	   
 	        os.flush();  
 			 
 		  }
 	 
 	  
 	  
 	  
		
 	  
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
    	   Object responseLine = (Object) is.readObject();
    	   
    	   if(responseLine instanceof LettreComposite) {
    		   System.out.println("Le serveur à reçu : "+((LettreComposite)responseLine).print());
    	   }else {
    	
    			String s = "";
    			
    			for(Phrase p : (ArrayList<Phrase>)responseLine ) {
    				s += p.print();
    			}
    			
    			System.out.println("Saisie terminée : "+s);
    			continuer = false;
    		
    		  
    	   }
    	   
    	  
     

       } catch (UnknownHostException e) {
           System.err.println("Trying to connect to unknown host: " + e);
       } catch (IOException e) {
           System.err.println("IOException:  " + e);
       }
   }

}