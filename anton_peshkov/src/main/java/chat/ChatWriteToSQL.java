package chat;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatWriteToSQL extends Thread {
	private int port;
	List<String> list;

	public ChatWriteToSQL(int port) {
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
				if(str.equalsIgnoreCase("exit")){
					list.forEach(System.out::println);
					break;
				}
			}
			this.interrupt();
			System.out.println();
			System.out.println("ServerList interrupted!");
			System.out.println("-----------------------");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
