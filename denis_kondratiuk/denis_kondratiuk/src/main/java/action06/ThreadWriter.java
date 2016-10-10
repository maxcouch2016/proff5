package action06;

import java.util.Scanner;

public class ThreadWriter extends Thread {
	
	private volatile Boolean isWhait = false; 
	private Boolean die = false;
	
	public Boolean getIsWhait() {
		return isWhait;
	}

	public void setIsWhait(Boolean isWhait) {
		this.isWhait = isWhait;
	}
	
	


	public Boolean getDie() {
		return die;
	}

	public void setDie(Boolean die) {
		this.die = die;
	}

	@Override
	public void run() {
		while (!die) {
			if(Monitor.getThreadCreator().getFiles().isEmpty()) {
				synchronized (Monitor.getThreadCreator().getFiles()) {
					try {
						Monitor.getThreadCreator().getFiles().wait();
						System.out.println("I am!!!!");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} else {
				Monitor.setFileName2(Monitor.getThreadCreator().getFiles().get(0));
			}
			
			
			
			
//			Monitor.setFileName2(Monitor.getFileName1());
//			synchronized (isWhait) {
//				try {
//					isWhait = true;
//					wait();
//			
//					System.out.println("I ALIVE");
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			} 
		
		}
	}

}
