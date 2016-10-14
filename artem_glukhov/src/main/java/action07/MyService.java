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

class MyServer extends Thread{
	private int port;
	public MyServer (int port){
		this.port = port;
	}
	
	
	public void run(){
		ServerSocket server;
		try {
			server = new ServerSocket(port); //zapusk serv
			while(isInterrupted()){
				  Socket socket = server.accept();  	
					new SenderMessage(socket).start();
				}
		} catch (IOException e) {
			e.printStackTrace();
		} 		
	}
	
}

class SenderMessage extends Thread{
	Socket socket;
	public SenderMessage (Socket sock){
		socket = sock ;
			}
	public void run(){
	
		while(true){
			OutputStream is;
			int count= 0;
			try {
				is = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(is);
				sleep(2000);
				dos.writeUTF("count="+count++);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
		
		
		
		
		
	}
	
}

class MyClient extends Thread {
	private int port;
	public MyClient (int port){
		this.port = port;
		
	}
	
	public void run(){
		try {
			Socket socket = new Socket ("localhost",port);
				//socket.getOutputStream();
				//socket.getInputStream();
			
			InputStream is =socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
	//		while(true)
//			String str = dis.readUTF();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}