package action06;

public class Monitor {

	private static String fileName1;
	private static String fileName2;
	private static ThreadCreator threadCreator;
	
	public static void main(String[] args) {
		boolean flag = true;
		ThreadWriter threadWriter = new ThreadWriter();
		threadCreator = new ThreadCreator(threadWriter);
		
		threadCreator.start();
		threadWriter.start();
//		try {
//			threadWriter.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			while(!threadWriter.getIsWhait()) {
//				
//			}
//			threadWriter.notifyAll();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		try {
//			if(threadWriter.isAlive()){
//							threadWriter.wait();
//
//			}
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static ThreadCreator getThreadCreator() {
		return threadCreator;
	}



















	public static void setThreadCreator(ThreadCreator threadCreator) {
		Monitor.threadCreator = threadCreator;
	}



















	private void stopThreadCreator() {

	}

	public static String getFileName1() {
		return fileName1;
	}

	public static void setFileName1(String fileName1) {
		Monitor.fileName1 = fileName1;
	}

	public static String getFileName2() {
		return fileName2;
	}

	public static void setFileName2(String fileName2) {
		Monitor.fileName2 = fileName2;
	}

}
