import java.io.IOException;


public class MainServer {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		 Properties properties = new Properties("en");
		 System.out.println(properties.getValeur("titre"));
		 System.out.println(properties.getValeur("consigne")); 
		 
	SimpleServer.init();
	SimpleServer.acceptUser();
	while(true) {
		SimpleServer.call();
	}

	}

}
