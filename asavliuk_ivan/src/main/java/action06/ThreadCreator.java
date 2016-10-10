package action06;

import java.io.FileWriter;
import java.util.Scanner;

public class ThreadCreator extends Thread{
	private String nameFill;
	
	public ThreadCreator(String nameFill) {
		this.nameFill = nameFill;
	}

	@Override
	public void run(){	
		FileWriter fileWriter = null;
		
		try{
			fileWriter=new FileWriter(nameFill);
		}catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();;
		}
		
		Scanner newScan = new Scanner(System.in);
		try {
			String string =newScan.next(); 
			
				if (string.equals("exit")||string.equals("quit")){
					newScan.close();
					this.interrupt();
					
    	
			}
				fileWriter.write(string);
				fileWriter.close();
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	public Boolean isKiled(){
		return isKiled();
	}

}
