package action07;

public class MainServer {

	public static void main(String[] args) {
		new Task1Server(8090).start();
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Task1Client(8090).start();

	}
}
