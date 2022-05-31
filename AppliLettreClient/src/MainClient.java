import java.io.IOException;


public class MainClient {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		SimpleClient.init();
		while(SimpleClient.continuer) {
			ControllerClient.envoyerCaractere();
			ControllerClient.getReponseClient();
		}
		SimpleClient.socketOfClient.close();
		}
}
