

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerClient {
	
	public static void afficherReponseServeur(String response) {
		Interface.afficherMessage("Réponse du serveur : "+response);
		}
	
	public static boolean verifierReponseServeur(String response) {
		return response.length() <= 1;
		}
	
	public static void envoyerCaractere() throws IOException {
		Scanner sc = new Scanner(System.in);
	 	   Interface.afficherMessage("Caractère client en attente :");
	 	   String caractere = sc.nextLine();
	 	   SimpleClient.envoiMessage(caractere);
	}
	
	public static void getReponseClient() throws ClassNotFoundException {
		SimpleClient.call();
	}


}
