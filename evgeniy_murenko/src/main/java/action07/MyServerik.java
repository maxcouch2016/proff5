package action07;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/*1. Создать поток1, который будет сервером, у которого есть поле List<String>. 
	Он будет принимать сообщения от клиентов и складывать у себя в список строк.
	Как только он принимает сообщение с текстом "Caput", то сервер выводит все сообщения в консоль и очищает его.
*/

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyServerik extends Thread {
	private List<String> list;
	private int port;

	public MyServerik(int port) {
		this.port = port;
		this.list = new ArrayList<>();
	}

	public void run() {
		try {
			ServerSocket server = new ServerSocket(port);
			System.out.println("ServerSocket started!");
			while (!isInterrupted()) {
				Socket socket = server.accept();
				System.out.println("Connect");
				new Message(socket).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	class Message extends Thread {
		private Socket socket;

		public Message(Socket sock) {
			this.socket = sock;
		}

		public void run() {
			try {
				InputStream is = socket.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				while (true) {
					String str = dis.readUTF(); 
					if (str.equals("111")) {
						System.out.println(list);
					} else {
						list.add(str);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}