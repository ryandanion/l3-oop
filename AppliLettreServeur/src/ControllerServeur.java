
import java.util.ArrayList;


public class ControllerServeur {
	
	     static ArrayList<Caractere> listCaractere = new ArrayList<Caractere>();
	     static ArrayList<Mot> listMot = new ArrayList<Mot>();
	     static ArrayList<Phrase> listPhrase = new ArrayList<Phrase>();
	     static Messenger messenger = new Messenger();

	public static void traiterCaractereRecuperer(String line) {
			   if(line != "") {
            String caractere = line;
				if(caractere.equals(".") || caractere.equals("!") || caractere.equals("?")) {
					listMot.add(messenger.getMot(listCaractere));
					listCaractere.clear();
					listPhrase.add(messenger.getPhrase(listMot,caractere.charAt(0)));
					listMot.clear();
				}else {
					listCaractere.add(messenger.getCaractere(caractere.charAt(0)));
				}
		}
	}
	public static String traiterFin() {
		listMot.add(messenger.getMot(listCaractere));
		
		listCaractere.clear();
		
			listPhrase.add(messenger.getPhrase(listMot,' '));
			
			String s = "";
   			
   			for(Phrase p : listPhrase) {
   				s += p.print();
   			}
   			
   			return s;  

	}
}