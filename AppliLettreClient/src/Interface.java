
public class Interface {
	
	public static void afficherMessage(String message) {
		System.out.println(message);
	}
	
	public static void traiterReponseServeur(String message) {
		Interface.afficherMessage("R�ponse du serveur : "+message);
	}

}
