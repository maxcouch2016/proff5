package action07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class ServiceCaput {

	// public static List<String> messages;

	public static void main(String[] args) {
		new MyServerCaput(8085).start();
		new MyClientCaput(8085).start();

	}

}

class MyServerCaput extends Thread {
	public List<String> messages;
	private int port;

	public MyServerCaput(int port) {
		this.port = port;
		this.messages = new ArrayList<>();
	}

	public void run() {
		ServerSocket server;
		try {
			server = new ServerSocket(port);
			System.out.println("ServerSocket started!");
			while (!isInterrupted()) {
				Socket socket = server.accept();
				new SenderMessageCaput(socket).start();

			}

			System.out.println(messages);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	class SenderMessageCaput extends Thread {
		private Socket socket;

		public SenderMessageCaput(Socket sock) {
			socket = sock;
		}

		public void run() {
			int count = 0;
			try {
				InputStream is = socket.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				// OutputStream os = socket.getOutputStream();
				// DataOutputStream dos = new DataOutputStream(os);
				
				while (count < 5) {
					sleep(2000);
					String message = dis.readUTF();
					System.out.println(message);
					messages.add(message);
					count ++;

				}
				System.out.println(messages);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

class SenderMessageCaput extends Thread {
	private Socket socket;

	public SenderMessageCaput(Socket sock) {
		socket = sock;
	}

	public void run() {
		int count = 0;
		try {
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			// OutputStream os = socket.getOutputStream();
			// DataOutputStream dos = new DataOutputStream(os);
			while (true) {
				sleep(2000);
				String message = dis.readUTF();
				System.out.println(message);
				// ServiceCaput.messages.add(message);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MyClientCaput extends Thread {
	private int port;

	public MyClientCaput(int port) {
		this.port = port;
	}

	public void run() {
		try {
			Socket socket = new Socket("localhost", port);
			System.out.println("ClientSocket started!");

			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);

			int count = 0;
			while (count < 10) {
				String message = "Hello";
				dos.writeUTF(message);
				count++;

			}

			// InputStream is = socket.getInputStream();
			// DataInputStream dis = new DataInputStream(is);
			// while (true) {
			// String str = dis.readUTF();
			// System.out.println("client:" + str);
			// }

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
