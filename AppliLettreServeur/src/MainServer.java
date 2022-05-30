import java.io.IOException;


public class MainServer {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
	SimpleServer.init();
	SimpleServer.acceptUser();
	while(true) {
		SimpleServer.call();
	}

	}

}
