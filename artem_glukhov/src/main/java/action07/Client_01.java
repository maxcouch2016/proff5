/*клиент. поток считывает с консоли инофрмацию и отправляет на сервер.
Остановка двух потоков, после ввода слова "Full Caput".
*/
package action07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client_01 extends Thread {
	private Scanner scan;
	private String msg;
	private int port;
	private Socket socket;
	private OutputStream os;
	private DataOutputStream dos;
	
	public Client_01(int port) {
		this.port = port;
	}


@Override
	public void run(){
	System.out.println("запуск");
			try {
				socket = new Socket ("Localhost", port);
				System.out.println("Client Started!");
				os =socket.getOutputStream();
				dos = new DataOutputStream(os);
				while(true){
				try {
					sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
				scan = new Scanner(System.in);
				msg = scan.nextLine();
				dos.writeUTF(msg);
				socket.close();	
					System.out.println("client" + msg);
					
				}
			} catch (UnknownHostException e) {
					e.printStackTrace();
			} catch (IOException e) {
					e.printStackTrace();
			} 
	}
}
