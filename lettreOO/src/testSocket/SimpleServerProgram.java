package testSocket;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import Utils.Properties;
import lettreOO.Caractere;
import lettreOO.LettreComposite;
import lettreOO.Messenger;
import lettreOO.Mot;
import lettreOO.Phrase;

public class SimpleServerProgram {

	 static ServerSocket listener = null;
     static Object line;
     static ObjectInputStream is;
     static ObjectOutputStream os;
     static Socket socketOfServer = null;
     static Boolean sortie = false;
     static Boolean intermediaire = false;
     static ArrayList<Caractere> listCaractere = new ArrayList<Caractere>();
     static ArrayList<Mot> listMot = new ArrayList<Mot>();
     static ArrayList<Phrase> listPhrase = new ArrayList<Phrase>();
     static Messenger messenger = new Messenger();
	
	public static void init() throws IOException {

	       try {
	           listener = new ServerSocket(9999);
	       } catch (IOException e) {
	           System.out.println(e);
	           System.exit(1);
	       }
	       
	       System.out.println("Server is waiting to accept user...");

           // Accept client connection request
           // Get new Socket at Server.   
	      
		
	}
	
	public static void acceptUser() throws IOException {
	
		 socketOfServer = listener.accept();
         System.out.println("Accept a client!");
      // Open input and output streams
       
        
	}
	public static void call() throws IOException, ClassNotFoundException {
      
		  is = new ObjectInputStream(socketOfServer.getInputStream());
	         os = new ObjectOutputStream(socketOfServer.getOutputStream());	
       // Try to open a server socket on port 9999
       // Note that we can't choose a port less than 1023 if we are not
       // privileged users (root)

       try {

               // Read data to the server (sent from client).
               line = (Object) is.readObject();
               // Write to socket of Server
               // (Send to client)
      
            
               
   			if(sortie != true) {
   				
     
   			if(line instanceof Caractere) {
   
                String caractere = ((LettreComposite) line).print();
   				intermediaire = false;
   				
   				if(caractere.equals(".") || caractere.equals("!") || caractere.equals("?")) {
   					listMot.add(messenger.getMot(listCaractere));
   					listCaractere.clear();
   					listPhrase.add(messenger.getPhrase(listMot,caractere.charAt(0)));
   					listMot.clear();
   				}else {
   					listCaractere.add(messenger.getCaractere(caractere.charAt(0)));
   				}
   				
   			}else {
   				listMot.add(messenger.getMot(listCaractere));
   	
   				listCaractere.clear();
   				
   					listPhrase.add(messenger.getPhrase(listMot,' '));
   					sortie = true;
   					os.writeObject(listPhrase);
   	   	            os.flush();
   	   	            
   	   	     
   			}	
   			
   		
   			os.writeObject(line);
            os.flush();  
            
            
            
   			}


       } catch (IOException e) {
           System.out.println(e);
           e.printStackTrace();
       }
   }
}