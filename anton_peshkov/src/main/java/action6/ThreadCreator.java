package action6;


public class ThreadCreator extends Thread{
	MyFile nameFile;
	boolean isAlive;
	
	public ThreadCreator(MyFile nameFile){
		this.nameFile = nameFile;
		isKilled = false;
	}

	@Override
	public void run() {
		
	}
			

	public boolean isAlive(){
		return isAlive;
	}
}
