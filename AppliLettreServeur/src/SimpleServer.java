
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


public class SimpleServer {

	 static ServerSocket listener = null;
     static String line;
     static ObjectInputStream is;
     static ObjectOutputStream os;
     static Socket socketOfServer = null;
     public static Boolean sortie = false;

     
	
	public static void init() throws IOException {


	           listener = new ServerSocket(9999);

	       
	       System.out.println("Server is waiting to accept user...");


	}
	
	public static void acceptUser() throws IOException {
	
		 socketOfServer = listener.accept();
         System.out.println("Accept a client!");
     
        
	}
	public static void call() throws IOException, ClassNotFoundException {
      
		  is = new ObjectInputStream(socketOfServer.getInputStream());
	         os = new ObjectOutputStream(socketOfServer.getOutputStream());	

    	   
             String line = (String) is.readObject().toString();
            
   	
   				
   			if(line.length() < 2) {
   				ControllerServeur.traiterCaractereRecuperer(line);
   			}
   			else {
   			 line = ControllerServeur.traiterFin();
   			 sortie = true;
   			}	

   			os.writeObject(line);
            os.flush();  
            
   }
}