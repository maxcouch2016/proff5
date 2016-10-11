package action07;

public class MyMain {

	public static void main(String[] args) {
		new MyClientik(8086).start();
		new MyServerik(8086).start();

	}

}
