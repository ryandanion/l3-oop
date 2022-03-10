package lettreOO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Utils.Properties;

public class programme {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayObjectSimple2<Integer> array = new ArrayObjectSimple2<Integer>(10);
		array.ajouteElement(1, 3);
		
		array.ajouteElement(6, 2);
		System.out.println(array.toString());
		
	/*	Scanner sc = new Scanner(System.in);
		Boolean sortie = false;
		Boolean intermediaire = false;
		Mot m = new Mot();
		Caractere c = new Caractere("");
		Phrase p = new Phrase();
		Lettre l = new Lettre();
		
		
		
		
		Properties properties = new Properties("en");
		System.out.println(properties.getValeur("titre"));
		System.out.println(properties.getValeur("consigne"));
		
		while(sortie != true) {
			String caractere = sc.nextLine();
			
			if(caractere != "") {
				intermediaire = false;
				if(Character.isLetter(caractere.charAt(0))) {
					c = new Caractere(caractere);
					m.addCaractere(c);
				}else {
					Caractere a = new Ponctuation(caractere);
					m.addCaractere(a);
					p.addMot(m);
					m=new Mot();
			
							
					if(caractere.equals("!") || caractere.equals(".") || caractere.equals("?")) {
						l.addPhrase(p);
						p = new Phrase();
					}
				}
			}else {
				c = new Ponctuation(" ");
				m.addCaractere(c);
				p.addMot(m);
				m = new Mot();
				if(intermediaire)
					sortie = true;
				intermediaire=true;
			}
		} 
		
		System.out.println(l.getLettre()); */
	} 
	
}
