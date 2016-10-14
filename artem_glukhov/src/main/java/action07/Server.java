package action07;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
	private ServerSocket server;
	private final int port;

	public Server(int p) {
		port = p;
	}

	public void run() {
		try {
			server = new ServerSocket(port);
			System.out.println("Server is started!");
			while (true) {
				Socket socket = server.accept();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (server != null) {
				try {
					server.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


