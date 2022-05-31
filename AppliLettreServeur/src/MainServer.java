import java.io.IOException;


public class MainServer {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		 Properties properties = new Properties();
		 System.out.println(properties.getValeur("titre"));
		 System.out.println(properties.getValeur("consigne")); 
		 
	SimpleServer.init();
	SimpleServer.acceptUser();
	while(SimpleServer.sortie == false) {
		SimpleServer.call();
	}
	
	SimpleServer.socketOfServer.close();

	}

}
