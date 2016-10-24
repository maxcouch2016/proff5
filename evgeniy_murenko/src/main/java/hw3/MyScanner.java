package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
1. Написать свой класс MyScanner, который бы работал также как и стандартный класс Scanner. 
Реализовать методы: next, nextInt, nextDouble, nextLine
hasNext, hasNextLine, hasNextInt, hasNextDouble.
Учесть нюансы:
 - при вводе какого-то значения пользователем в консоли это записывается в "память" сканнера и потом обрабатывается метода
 - если в программе MyScanner с консоли ввести "привет", то оба метода scan.hasNextInt() 
  вернут false и поэтому на экран выведется "Line=привет", 
 - если ввести "10", "20" и "30", то оно должно отрабатывать также как и "10 20 30". 
*/

public class MyScanner {
	private BufferedReader reader;
	private int flag;

	public MyScanner(InputStream is) {
		Reader read = new InputStreamReader(is);
		reader = new BufferedReader(read);
	}

	public String next() throws IOException {
		String str = "";
		int ch;
		while ((ch = reader.read()) != -1) {
			if (ch != 32 && ch != 10 && ch != 13) {
				str += (char) ch;
			}
			if (ch == 32 && str.equals("")) {
				continue;
			}
			if (ch == 32 || ch == 10 || ch == 13) {
				return str;
			}
		}
		return str;
	}

	public String nextLine() throws IOException {
		int ch;
		String str = "";
		StringBuilder sb = new StringBuilder();
		while ((ch = reader.read()) != -1) {
			if (ch != 13 && ch != 10) {
				sb.append((char) ch);
			}
			if (ch == 13) {
				return sb.toString();
			}
		}
		return sb.toString();
	}

	public int nextInt() throws NumberFormatException, IOException {
		int i = 0;
		try {
			i = Integer.parseInt(this.next());
		} catch (NumberFormatException e) {
			/* NOP */
		}
		return i;
	}

	public Double nextDouble() throws NumberFormatException, IOException {
		Double i = 0d;
		try {
			i = Double.parseDouble(this.next());
		} catch (NumberFormatException e) {
			/* NOP */
		}
		return i;
	}

	public boolean hasNext() throws IOException {
		reader.mark(1);
		if (reader.read() != -1) {
			reader.reset();
			return true;
		}
		return false;
	}

	public boolean hasNextLine() throws IOException {
		reader.mark(1);
		if (reader.readLine() != null) {
			reader.reset();
			return true;
		}
		return false;
	}

	public boolean hasNextInt() throws IOException {
		reader.mark(1);
		if (reader.read() != -1) {
			Integer.parseInt(next());
			reader.reset();
			return true;
		}
		return false;
	}
}
