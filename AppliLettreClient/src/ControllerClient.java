

import java.util.ArrayList;

public class ControllerClient {
	
	public static void AfficherReponseServeur(String response) {
		Interface.afficherMessage("Réponse du serveur : "+response);
		}
	
	public static boolean VerifierReponseServeur(String response) {
		return response.length() <= 1;
		}
	


}
