package lettreOO;

import java.util.ArrayList;

public class Messenger {
	
	public Caractere getCaractere(char c) {
		return new Caractere(c);
	}
	
	public Mot getMot(ArrayList<Caractere> list) {
		return new Mot(list);
	}
	
	public Phrase getPhrase(ArrayList<Mot> list) {
		return new Phrase(list);
	}

}
