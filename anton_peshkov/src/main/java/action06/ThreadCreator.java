package action06;

import java.util.Scanner;

public class ThreadCreator extends Thread {
	MyFile nameFile;
	boolean isKilled;

	public ThreadCreator(MyFile nameFile) {
		this.nameFile = nameFile;
		isKilled = false;
	}

	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		String s = "";
		while (s.equals("exit") || s.equals("quit")) {
			s = scanner.nextLine();
			nameFile.write(s);
		}
		isKilled = true;
		this.interrupt();

	}

	public boolean isKilled() {
		return isKilled;
	}
}
