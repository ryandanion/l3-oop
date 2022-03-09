package lettreOO;

import java.util.ArrayList;

public class Lettre {
	
	ArrayList<Phrase> list;
	
	public Lettre() {
		list = new ArrayList<Phrase>();
	}
	
	public String getLettre() {
		String lettre = "";
		for(Phrase p : list) {
			lettre+= p.getPhrase();
		}
		return lettre;
	}
	
	public void addPhrase(Phrase phrase) {
		list.add(phrase);
	}

}
