package action07;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SenderMassege extends Thread {
	private Socket socket;
	public SenderMassege(Socket sock) {
	socket = sock;
	}

	public void run() {
		int count = 0;
		try {
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
		while (true) {
				sleep(500);
				dos.writeUTF("count=" + (count++));
				if(1==0) break;
			}
			socket.close();
		} catch (Exception e) {
			System.out.println("dfsfsdf");
			e.printStackTrace();

}
}
}