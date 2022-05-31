
import java.util.ArrayList;

public class Messenger {
	
	public Ponctuation getPonctuation(char p) {
		return new Ponctuation(p);
	}
	
	public Caractere getCaractere(char c) {
		return new Caractere(c);
	}
	
	public Mot getMot(ArrayList<Caractere> list) {
		return new Mot(list);
	}
	
	public Phrase getPhrase(ArrayList<Mot> list,char p) {
		return new Phrase(list,getPonctuation(p));
	}

}
