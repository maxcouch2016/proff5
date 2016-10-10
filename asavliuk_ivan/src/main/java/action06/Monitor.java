/*		Написать класс Monitor(nameFile1,nameFile2), в котором два потока.
		
		1. Поток 1(ThreadCreator), считывает строку с консоли записывает в nameFile1, 
		 будит поток 2.(objSynchro.notify())
		 
		2. Поток 2(ThreadWriter), копирует nameFile1 в nameFile2 и засыпает. 
		 (objSynchro.wait()) 
		
		Примечание: 
		1. если с консоли введено слово "exit" или "quit", то поток №1 останавливать.
		2. продумать остановку и второго потока.*/

package action06;

public class Monitor {
	ThreadCreator tCreator;
	ThreadWriter tWriter;

	public Monitor(String nameFile1, String nameFile2) {

		this.tCreator = new ThreadCreator(nameFile1);
		this.tWriter = new ThreadWriter(nameFile1, nameFile2);
	}

	public void run() {
		tWriter.start();
		try {
			tWriter.wait();
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		tCreator.start();
	}

}
