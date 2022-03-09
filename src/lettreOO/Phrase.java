package lettreOO;

import java.util.ArrayList;

public class Phrase {
	
	ArrayList<Mot> list;
	
	public Phrase() {
		list = new ArrayList<Mot>();
	}
	
	public String getPhrase() {
		String phrase = "";
		for(Mot m : list) {
			phrase+=m.getMot();
		}
		
		return phrase;
	}
	
	public void addMot(Mot mot) {
		list.add(mot);
	}


}
