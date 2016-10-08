package action6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ThreadWriter extends Thread {
	private String file1;
	private String file2;

	public ThreadWriter(String file1, String file2){
		this.file1 = file1;
		this.file2 = file2;
	}
	
	@Override
	public void run(){
		FileReader reader = null;
		FileWriter writer = null;
		try {
			reader = new FileReader(file1);
			writer = new FileWriter(file2);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StringBuilder s = new StringBuilder("");
		
		int c;
		try {
			while((c=reader.read())!=-1){
				s.append((char)c);
			}
			
			writer.write(s.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
