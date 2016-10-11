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
import java.util.Scanner;

public class Caput {
	static int portSerial = 8053;
	public static void main(String[] args) {
		
		new MyServer1(portSerial).start();
		new ServerList(portSerial).start();

	}

}
class MyServer1 extends Thread {
	private int port;

	public MyServer1(int port) {
		this.port = port;
	}

	public void run() {
		ServerSocket server;
		try {
			server = new ServerSocket(port);
			System.out.println("ServerSocket started!");
			while (!isInterrupted()) {
				Socket socket = server.accept();
				new MyClient1(socket).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class ServerList extends Thread {
	private int port;
	List<String> list;

	public ServerList(int port) {
		this.port = port;
		list = new ArrayList();
	}

	public void run() {
		try {
			Socket socket = new Socket("localhost", port);
			System.out.println("ClientSocket started!");
			
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			while (true) {
				String str = dis.readUTF();
				list.add(str);
				if(str.equals("Full Caput")){
					list.forEach(System.out::println);
					break;
				}
			}
			this.interrupt();
			System.out.println("\nServerList interrupted!\n-----------------------");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MyClient1 extends Thread {
	private Socket socket;

	public MyClient1(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);

			Scanner scanner = new Scanner(System.in);
			while (true) {
				String s = scanner.nextLine();
				dos.writeUTF(s);
				if(s.equals("Full Caput"))break;
			}
			this.interrupt();
			System.out.println("\nMyClient interrupted!\n-----------------------");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
