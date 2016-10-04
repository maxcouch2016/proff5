package action06;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
 
public class SocketsExample {	
}

class Server extends Thread {
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

class Client {
	private String url;
	private int port;
	private Socket socket;

	public Client(String url, int port) {
		this.url = url;
		this.port = port;
	}

	public void connect() {
		try {
			socket = new Socket(url, port);
			//InputStream is = socket.getInputStream();
			//DataInputStream dis = new DataInputStream(is);

			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);

			while(true)dos.writeUTF("Hello server");
			//String str = dis.readUTF();
			//System.out.println("Client receive from srever:" + str);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
