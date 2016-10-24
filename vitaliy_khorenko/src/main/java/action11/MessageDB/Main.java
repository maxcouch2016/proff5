package action11.MessageDB;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		//Message message = new Message("PREVED");
		//WorkerMessager workerMessager = new WorkerMessager(message);
		//workerMessager.save();
		
		
		WorkerMessager workerMessager = new WorkerMessager();
		List<String> list = workerMessager.listAll();
		
		System.out.println(list);
		
		
		
		

	}

}
