package action06;
//Поток 1(ThreadCreator), считывает строку с консоли записывает в nameFile1, 
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThreadCreator extends Thread {
	private String filename1 ;
	private String temp1;
	
	
	public ThreadCreator(String filename1) {
	
		this.filename1 ="d:/"+ filename1; 
		temp1 = "";
		
	}

	
	public String getFilename1() {
		return filename1;
	}


	public String getTemp1() {
		return temp1;
	}




	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
	    temp1 =  sc.nextLine();
	 	try {
		FileWriter f1= new FileWriter(filename1,true);
		f1.write(temp1);
		
		System.out.println("zapisano" + temp1 + "v " + filename1  );
		f1.flush();
		f1.close();
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	  
		
	}
}
