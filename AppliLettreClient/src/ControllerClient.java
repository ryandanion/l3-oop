

import java.util.ArrayList;

public class ControllerClient {
	
	public static void traiterReponseServer(String response) {
	/*	  if(responseLine instanceof LettreComposite) {
			  Interface.afficherMessage("Le serveur � re�u : "+((LettreComposite)responseLine).print());
   		   return true;
   	   }else {
   	
   			String s = "";
   			
   			for(Phrase p : (ArrayList<Phrase>)responseLine ) {
   				s += p.print();
   			}
   			
   			Interface.afficherMessage("Saisie termin�e : "+s);
   			return false;  
   	   } */
		
		Interface.afficherMessage(response);
		}
	


}
