package action6;


public class Monitor {
	MyFile myFile1;
	MyFile myFile2;

	public Monitor(String nameFile1, String nameFile2) {
		myFile1 = new MyFile(nameFile1);
		myFile2 = new MyFile(nameFile2);
	}

	public static void main(String[] args) {
        Monitor monitor = new Monitor("text1", "text2");
        ThreadCreator threadCreator = new ThreadCreator(monitor.myFile1);
        ThreadWriter threadWriter = new ThreadWriter(monitor.myFile1,monitor.myFile2);
        threadWriter.setDaemon(true);

        threadWriter.start();

        threadCreator.start();
        while (threadCreator.isAlive()) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
