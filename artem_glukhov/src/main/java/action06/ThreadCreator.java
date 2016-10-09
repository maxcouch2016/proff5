package action06;
//Поток 1(ThreadCreator), считывает строку с консоли записывает в nameFile1, 
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThreadCreator extends Monitor {
	String filename1, filename2;
	private String temp1;
	String file;
	
	public ThreadCreator() {
		super();
		this.filename1 ="d:/"+ getNameFile1(); 
		this.filename2 ="d:/"+ getNameFile1();
		temp1 = "";
		
	}

	public void scan() throws IOException{
	Scanner sc = new Scanner(System.in);
	    temp1 =  sc.nextLine();
	  FileWriter f1 = new FileWriter(file,true);
	  f1.write(temp1);
	 
	
	}

}
