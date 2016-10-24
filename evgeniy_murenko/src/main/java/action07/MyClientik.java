package action07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClientik extends Thread {
	private int port;

	public MyClientik(int port) {
		this.port = port;
	}

	public void run() {
		try {
			Socket socket = new Socket("localhost", port);
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			Scanner scan = new Scanner(System.in);
			while (true) {
				dos.writeUTF(scan.nextLine());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
