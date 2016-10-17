package action07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.xml.sax.InputSource;

public class MyService {
	
	
	
}


class MyServer extends Thread{
	private int port;
	public MyServer(int port){
		this.port = port;
	}
	
	public void run(){
		ServerSocket server;
		try {
			server = new ServerSocket();
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
	public SenderMessage(Socket sock){
		socket = sock;
		
	}
	
	public void run(){
		int count = 0;
		while(true){
			OutputStream is;
			try {
				is = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(is);
				sleep(2000);
				dos.writeUTF("count=" + count++);
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}		
	}	
}






class MyClient extends Thread{
	private int port;
	public MyClient(int port){
		this.port = port;
	}
	
	public void run(){
		
		try {
			Socket socket = new Socket("lockalhost", port);
			
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			String str = dis.readUTF();
			
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
