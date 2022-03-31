///////////§§§§!!§§§§§§§§ CE PROGRAMME N'EST PAS LE BON, LE BON SE TROUVE DANS testSocket ///////////§§§§!!§§§§§§§§


/*package lettreOO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Utils.Properties;

public class programme {

	public static void main(String[] args) throws FileNotFoundException {
		
		Properties properties = new Properties("en");
		System.out.println(properties.getValeur("titre"));
		System.out.println(properties.getValeur("consigne"));
		Boolean sortie = false;
		Boolean intermediaire = false;
		ArrayList<Caractere> listCaractere = new ArrayList<Caractere>();
		ArrayList<Mot> listMot = new ArrayList<Mot>();
		ArrayList<Phrase> listPhrase = new ArrayList<Phrase>();
		Messenger messenger = new Messenger();
		
		Scanner sc = new Scanner(System.in);
		
		while(sortie != true) {
			String caractere = sc.nextLine();
			
			if(caractere != "") {
				intermediaire = false;
				
				if(caractere.equals(".") || caractere.equals("!") || caractere.equals("?")) {
					listMot.add(messenger.getMot(listCaractere));
					listCaractere.clear();
					listPhrase.add(messenger.getPhrase(listMot,caractere.charAt(0)));
					listMot.clear();
				}else {
					listCaractere.add(messenger.getCaractere(caractere.charAt(0)));
				}
				
			}else {
				
				listMot.add(messenger.getMot(listCaractere));
	
				listCaractere.clear();
				
				if(intermediaire) {
					listPhrase.add(messenger.getPhrase(listMot,' '));
					sortie = true;
				}
				intermediaire=true;
			}	
		}
		
		String s = "";
		
		for(Phrase p : listPhrase ) {
			s += p.print();
		}
		
		System.out.println(s);
		
		
		
		
	} 
	
} */
