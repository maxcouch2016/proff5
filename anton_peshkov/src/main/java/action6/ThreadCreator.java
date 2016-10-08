package action6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThreadCreator extends Thread{
	private String nameFile;
	private boolean isKilled = false;
	
	public ThreadCreator(String nameFile){
		this.nameFile = nameFile;
	}

	@Override
	public void run() {
		FileWriter file = null;
		try {
			file = new FileWriter(nameFile);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Scanner scanner = new Scanner(System.in);
		try {
			String s = scanner.nextLine();
			
			if(s.equals("exit") || s.equals("exit")) {
				this.interrupt();
				isKilled = true;
			}
			
			file.write(s);
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isKilled(){
		return isKilled;
	}
}
