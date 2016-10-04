package action06;

public class WaitNotify extends Thread {
	public void f() {
		while (true) {
			synchronized (this) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//break;
					//interrupt();
				}
				if (isInterrupted())
					break;
			}
		}
	}

	public void g() {
		synchronized (this) {
			this.notify();
		}
	}
}
