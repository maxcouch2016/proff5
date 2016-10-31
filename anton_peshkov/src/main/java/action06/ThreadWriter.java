package action06;

public class ThreadWriter extends Thread {

	private MyFile myFile1;
	private MyFile myFile2;
	boolean flag;

	public ThreadWriter(MyFile myFile1, MyFile myFile2) {
		this.myFile1 = myFile1;
		this.myFile2 = myFile2;
		flag = true;
	}

	@Override
	public void run() {
		myFile2.write(myFile1.read());

	}

	public void interruptWriter() {
		flag = false;
		this.interrupt();
	}

}
