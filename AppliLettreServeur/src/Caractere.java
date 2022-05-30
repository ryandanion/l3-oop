

public class Caractere extends LettreComposite{
	private final char caractere;
	
	public  Caractere(char caractere) {
		this.caractere = caractere;
	}


	public String printThisBefore() {
		return Character.toString(caractere);
	}
}
