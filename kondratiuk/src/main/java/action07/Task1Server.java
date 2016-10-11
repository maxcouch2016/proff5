package action07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1Server extends Thread {
	private int port;
	private List<String> list;

	public Task1Server(int port) {
		this.port = port;
		list = new LinkedList();
	}

	@Override
	public void run() {
		ServerSocket server;
		String str = "";
		try {
			server = new ServerSocket(port);
			while (!isInterrupted()) {
				System.out.println("yes");
				Socket socet = server.accept();
				DataInputStream dis = new DataInputStream(socet.getInputStream());
				while (true) {
					System.out.println("lolo");
					str = dis.readUTF();
					System.out.println(str);

					if (!str.toLowerCase().equals("caput")) {
						list.add(str);
					} else {
						System.out.println(list);
						list.clear();
					}
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Task1Client extends Thread {
	private int port;

	public Task1Client(int port) {
		this.port = port;
	}

	@Override
	public void run() {
		try {
			Socket s = new Socket("localhost", port);
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			Scanner scn = new Scanner(System.in);
			while (true) {
				String str = scn.next();
				dos.writeUTF(str);
				System.out.println(str);
				sleep(1);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
