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
	
	
public static void main(String[] args) throws InterruptedException {

	ThreadCreator thread1 = new ThreadCreator("text2.txt");
	thread1.setName("ПОТОК 1 ");
	//thread1.start();
	System.out.println(thread1.getName() + thread1.getState());
	
	
	
	
	
	ThreadWriter thread2 = new ThreadWriter("text1.txt", "text3.txt");
	//thread2.setDaemon(true);
	thread2.setName("ПОТОК 2 ");
	while(thread1.isAlive()==false){
			try{
				thread2.start();
				System.out.println(thread2.getName() + thread2.getState());
				thread2.sleep(1000);
				}
	catch(InterruptedException e){e.printStackTrace();}
	
	}
	System.out.println(thread2.getName()+thread1.getState());

thread2.start();
	
}
}


