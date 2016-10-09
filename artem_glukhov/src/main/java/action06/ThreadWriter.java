package action06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Поток 2(ThreadWriter), копирует nameFile1 в nameFile2 и засыпает.
public class ThreadWriter extends Monitor {
	String namefile1,namefile2;
	char [] buffer;
	int count;
	
			
	public ThreadWriter(String namefile1, String namefile2) {
		super();
		this.namefile1 = "d:/" + getNameFile1();
		this.namefile2 = "d:/" + getNameFile2();
		buffer = new char[20];
		count=0;
	}

	
	
	public void filecopy() throws IOException{
		 FileReader reader= new FileReader(getNameFile1());
		 FileWriter write = new FileWriter(getNameFile2(),true);
		 StringBuilder build = new StringBuilder("");
		 String  part = new String(buffer,0,count);
		 while((count=reader.read())!=-1){  // ((...))!!! 
			 build.append(part);
			 }	 
		 String  result = build.toString();
		 write.write(result);
		 
	}
	
	
	
}
