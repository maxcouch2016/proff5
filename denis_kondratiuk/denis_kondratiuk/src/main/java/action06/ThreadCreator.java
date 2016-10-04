package action06;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ThreadCreator extends Thread {
	private List<String> files = new LinkedList<>();
    private	ThreadWriter treadWriter;
   
	
	
	public ThreadCreator(ThreadWriter treadWriter) {
		this.treadWriter = treadWriter;
    }

	
	



	public List<String> getFiles() {
		return files;
	}






	public void setFiles(List<String> files) {
		this.files = files;
	}






	public ThreadWriter getTreadWriter() {
		return treadWriter;
	}






	public void setTreadWriter(ThreadWriter treadWriter) {
		this.treadWriter = treadWriter;
	}






	@Override
	public void run() {
//		Monitor.setFileName1(readForTerminal());
		synchronized (files) {
			files.add(readForTerminal());
//			files.notifyAll();
		}
//		if(treadWriter.isAlive()) {
//					treadWriter.notifyAll();
//
//		}
	}

	
	public String readForTerminal() {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		return str;
	}

}
