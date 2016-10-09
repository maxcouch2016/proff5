/* Написать класс Monitor(nameFile1,nameFile2), в котором два потока.
1. Поток 1(ThreadCreator), считывает строку с консоли записывает в nameFile1, 
   будет поток 2.(objSynchro.notify())
2. Поток 2(ThreadWriter), копирует nameFile1 в nameFile2 и засыпает. 
    (objSynchro.wait()) 
   Примечание: 
1. если с консоли введено слово "exit" или "quit", то поток №1 останавливать.
2. продумать остановку и второго потока.
*/

package action06;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Monitor extends Thread {
	private String nameFile1, nameFile2  ;
	
	public String getNameFile1() {
		return nameFile1;
	}

	public String getNameFile2() {
		return nameFile2;
	}
	
	@Override
		public void run() {
				
	//	this.creator = new ThreadCreator(nameFile1);
	//	this.writer = new ThreadWriter(nameFile1, nameFile2);
}
		

public static void main(String[] args) {
	
	//Monitor thread1 = new ThreadWriter( getNameFile1());
	//Monitor thread2 = new ThreadReader( getNameFile1());
}
}

