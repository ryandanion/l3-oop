package lettreOO;

import java.util.ArrayList;

public class Mot {
	ArrayList<Caractere> list;
	
	public Mot() {
		this.list  = new ArrayList<Caractere>();
	}
	
	public String getMot() {
		String mot = "";
		for(Caractere c : list) {
			mot+=c.getCaractere();
		}
		
		return mot;
	}
	
	public void addCaractere(Caractere caractere) {
		list.add(caractere);
	}

}
