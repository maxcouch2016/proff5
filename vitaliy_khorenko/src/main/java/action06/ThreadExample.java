package action06;


public class ThreadExample {
	public static void main(String[] args) {
		MyThread obj1 = new MyThread("Thread1");
		MyThread obj2 = new MyThread("\tThread2");

		obj1.start();
		obj2.setDaemon(true);
		//obj2.setPriority(10);
		obj2.start();
		System.out.println("\t\tend");
		//obj2.stop();
		//obj2.interrupt();
		
	} 
}

class MyThread extends Thread {
	private static ThreadExample mutex = new ThreadExample();
	private String name;
	public MyThread(String n){
		name = n;
	}
	@Override
	public void run() {
		System.out.println(name + "_begin");
		//synchronized (mutex) {
			for (int i = 0; i < 2000; i++) {
				if(isInterrupted()){break;}
				System.out.println(name + "_" + i);
			}
		//}
		System.out.println(name + "_end");

	}
}

