package action06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ThreadWriter extends Thread {

	private String file1;
	private String file2;

	public ThreadWriter(String file1, String file2) {
		super();
		this.file1 = file1;
		this.file2 = file2;
	}

	@Override
	public void run() {
		FileWriter fileWriter = null;
		FileReader fileReader = null;

		try {
			fileReader = new FileReader(file1);
			fileWriter = new FileWriter(file2);
			
		}catch (FileNotFoundException e1) {
			// TODO: handle exception
			e1.printStackTrace();
			
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		StringBuilder builder = new StringBuilder("");

		int characters;

		try {
			while ((characters = fileReader.read()) != -1) {
				builder.append((char) characters);
			}
			fileWriter.write(builder.toString());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
