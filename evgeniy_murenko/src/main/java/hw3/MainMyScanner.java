package hw3;

import java.io.IOException;
import java.util.Scanner;

public class MainMyScanner {
	public static void main(String[] args) throws IOException {
		MyScanner scan = new MyScanner(System.in);
		System.out.println(scan.nextLine());
		Scanner s = new Scanner(System.in);
		System.out.println(s.nextLine());
	}
}
