package lettreOO;

public class Ponctuation extends LettreComposite{
	
private final char ponctuation;
	
	public  Ponctuation(char caractere) {
		this.ponctuation = caractere;
	}
	
	public String printThisBefore() {
		return Character.toString(ponctuation);
	}

}
