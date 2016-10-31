package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ChatServer extends Thread {
		private int port;

		public ChatServer(int port) {
			this.port = port;
		}

		public void run() {
			ServerSocket server;
			try {
				server = new ServerSocket(port);
				System.out.println("ServerSocket started!");
				while (!isInterrupted()) {
					Socket socket = server.accept();
					new ChatClient(socket).start();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
