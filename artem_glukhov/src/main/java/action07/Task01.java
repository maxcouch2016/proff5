/* 1. Создать поток1, который будет сервером, у которого есть поле List<String>. 
Он будет принимать сообщения от клиентов и складывать у себя в список строк.
Как только он принимает сообщение с текстом "Caput", то сервер выводит все сообщения в консоль и очищает его.

2. Создать поток2, который будет клиентом. Этот поток считывает с консоли инофрмацию и отправляет на сервер.
Остановка двух потоков, после ввода слова "Full Caput".

*/
package action07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task01 extends Thread  {
	
	
	
	public void Mythread()   {
		
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		List <String> list =  new ArrayList<>();
		if (message.equals("Caput")){
			System.out.println("CAPUT");
			}
		if (message.equals("Full caput"))
			{ 
			System.out.println("Full CAPUT");
			
			}
		else {		list.add(message);
		    	}
		}
	
	public static void main(String[] args) {
	 	
//	MyThread thread1 = new Thread ();
	}
	

//	public Server 
	
}
