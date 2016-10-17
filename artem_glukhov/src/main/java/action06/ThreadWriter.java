package action06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Поток 2(ThreadWriter), копирует nameFile1 в nameFile2 и засыпает.
public class ThreadWriter extends Thread {
	String namefile1,namefile2;
	char [] buffer;
	int count;
	
			
	public ThreadWriter(String namefile1, String namefile2) {
		
		this.namefile2 = "d:/" + namefile2;
		//ThreadCreator filecreator = new ThreadCreator(namefile1);
		Thread thread2 = Thread.currentThread();
		this.namefile1 = "d:/" + namefile2;
		buffer = new char[20];
		count=0;
	}

	@Override
	public void run() {
		try {
			while(!isInterrupted()){
			FileReader reader = new FileReader(namefile1);
			FileWriter write = new FileWriter(namefile2, true);
			StringBuilder build = new StringBuilder("");
			String part = new String(buffer, 0, count);
			while ((count = reader.read()) != -1) { // ((...))!!!
				build.append(part);
			}
			String result = build.toString();
			write.write(result);
			write.flush();
			write.close();
			System.out.println("Zapisy " + result + "v " + namefile2);
			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
