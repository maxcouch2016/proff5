/* 1. Создать поток1, который будет сервером, у которого есть поле List<String>. 
Он будет принимать сообщения от клиентов и складывать у себя в список строк.
Как только он принимает сообщение с текстом "Caput", то сервер выводит все сообщения в консоль и очищает его.
2. Создать поток2, который будет клиентом. Этот поток считывает с консоли инофрмацию и отправляет на сервер.
Остановка двух потоков, после ввода слова "Full Caput".

*/
package action07;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class Server_01 extends Thread  {
	
	private List<String> list ;
	private Socket socket;
	private int port;
	String msg;
	private ServerSocket serversocket;
	
	public Server_01(int port) {
		this.port = port;
		this.list = new ArrayList<String>();
	}

	@Override
	public void run()   {
		try {
		serversocket = new ServerSocket(port);
		System.out.println("Serversocket started");
		
		while (!isInterrupted()){
			socket = serversocket.accept();
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			System.out.println("Serversocket accepted");
			msg = dis.readUTF();
		}
		} catch (IOException e) {
		e.printStackTrace();
		}
		if (msg.equals("Caput")){
		System.out.println("Caput");
		list.forEach(System.out::println);
		list.removeAll(list);
		
		}
					
		if (msg.equals("Full caput"))
			{ 
			System.out.println("Full CAPUT");
			
			}
		else {		list.add(msg);
					System.out.println("принял сообщение");
					
		    }
	}
	
	public static void main(String[] args) {
	
		Client_01 client = new  Client_01(8089);	
	Server_01 server = new Server_01 (8089);
	
	
	server.setDaemon(true);
	server.run();
	//client.run();
	if (server.msg.equals("Full caput")){
		server.stop();
		client.stop();
	
	}
	}
	


	
}
