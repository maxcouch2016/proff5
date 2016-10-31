package chat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClient extends Thread {
	private Socket socket;

	public ChatClient(Socket socket) {
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
			System.out.println();
			System.out.println("MyClient interrupted!");
			System.out.println("----------------------");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}