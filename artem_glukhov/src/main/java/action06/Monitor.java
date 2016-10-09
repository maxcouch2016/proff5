package action06;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* Написать класс Monitor(nameFile1,nameFile2), в котором два потока.
1. Поток 1(ThreadCreator), считывает строку с консоли записывает в nameFile1, 
 будит поток 2.(objSynchro.notify())
2. Поток 2(ThreadWriter), копирует nameFile1 в nameFile2 и засыпает. 
 (objSynchro.wait()) 
Примечание: 
1. если с консоли введено слово "exit" или "quit", то поток №1 останавливать.
2. продумать остановку и второго потока.
package action06;
*/
public class Monitor extends Thread {
	
	public void scan(){
	Scanner sc = new Scanner(System.in);
	   String temp =  sc.next();
	  
	  try {
		FileWriter file1 = new FileWriter("d:\nameFile1");
//			file.
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
		
		@Override
		public void run() {
			
}
		
		public static void main(String[] args) {
			Monitor obj1 = new Monitor();
			Monitor obj2 = new Monitor();

			obj1.start();
			
		}
}
