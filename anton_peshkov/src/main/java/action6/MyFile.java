package action6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFile {
	FileWriter writer;
	FileReader reader;
	File name;

	public MyFile(String name) {
		this.name = new File(name);
	}

	public String read() {
		try {
			reader = new FileReader(this.name);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuilder builder = new StringBuilder();
		int c = 0;
		try {
			while ((c = reader.read()) != -1) {
				builder.append((char) c);
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return builder.toString();
	}

	public void write(String text) {
		try {
			writer = new FileWriter(this.name);
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
