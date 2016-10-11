package action07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyService {
	public static void main(String[] args) {
		new MyServer(8085).start();
		new MyClient(8085).start();
	}

}

class MyServer extends Thread {
	private int port;

	public MyServer(int port) {
		this.port = port;

	}

	@Override
	public void run() {
		ServerSocket server;
		try {
			server = new ServerSocket(port);
			System.out.println("Server Start!");
			while (!isInterrupted()) {
				Socket socet = server.accept();
				new SenderMessage(socet).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyClient extends Thread {
	private int port;

	public MyClient(int port) {
		this.port = port;

	}

	@Override
	public void run() {
		try {
			Socket socket = new Socket("localhost", port);
			System.out.println("client Started");
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			while (true) {
				String str = dis.readUTF();
				System.out.println(str);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class SenderMessage extends Thread {
	Socket socet;

	public SenderMessage(Socket sock) {
		socet = sock;
	}

	@Override
	public void run() {
		int count = 0;
		try {
			OutputStream os = socet.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			while (true) {
				sleep(2000);
				dos.writeUTF("count=" + (count++));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
