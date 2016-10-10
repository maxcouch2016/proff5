package action6;


public class Monitor {
	ThreadCreator creator;
	ThreadWriter writer;

	public Monitor(String nameFile1, String nameFile2) {

		this.creator = new ThreadCreator(nameFile1);
		this.writer = new ThreadWriter(nameFile1, nameFile2);
	}

	public void run() {
		writer.start();
		try {
			writer.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		creator.start();
	}
}
