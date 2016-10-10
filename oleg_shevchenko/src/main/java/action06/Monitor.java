package action06;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Monitor {
	private String nameFile1, nameFile2;
	
	
	public Monitor(String nameFile1, String nameFile2) {
		this.nameFile1 = nameFile1;
		this.nameFile2 = nameFile2;
	}
	
	public void start() {
		ThreadWriter thrWriter = new ThreadWriter(nameFile1, nameFile2);
		ThreadCreator thrCreate = new ThreadCreator(nameFile1, thrWriter);
		thrCreate.start();
		thrWriter.start();
	}
}

class ThreadCreator extends Thread {
	private String nameFile1;
	private Thread threadWriter;
	public ThreadCreator(String nameFile1, Thread threadWriter) {
		super();
		this.nameFile1 = nameFile1;
		this.threadWriter = threadWriter;
	}

	@Override
	public void run() {
		System.out.println("creator start");
		Scanner scan = new Scanner(System.in);
		String msg = "";
		File file1 = new File(nameFile1);
		try {	
			while(true) {
				FileWriter fw = new FileWriter(file1);
				System.out.print("Введите строку: ");
				msg = scan.nextLine();
				if(msg.equals("exit") || msg.equals("quit")) {
					threadWriter.interrupt();
					break;
				}
				fw.append(msg);
				fw.flush();
				fw.close();
				synchronized(threadWriter) {
					threadWriter.notify();
				}
			}
		} catch (IOException exc) {
			exc.printStackTrace();
		}		
	}
}

class ThreadWriter extends Thread {
	private File file1, file2;

	public ThreadWriter(String nameFile1, String nameFile2) {
		super();
		file1 = new File(nameFile1);
		file2 = new File(nameFile2);
	}
	@Override
	public void run() {
		System.out.println("writer start");
		try {
			file2.createNewFile();
			int ch;
			while(!isInterrupted()) {
				if(file1.isFile()) {
					FileWriter fw = new FileWriter(file2);
					FileReader fr = new FileReader(file1);
					while((ch = fr.read()) != -1) {
						fw.append((char) ch);
					}
					fr.close();
					fw.flush();
					fw.close();
				} else {
					System.out.println("File1 not found");
				}
				wait();
			}
		} catch(IOException exc) {
			exc.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}