package action06;

public class MonitorMain {
	public static void main(String[] args) {
		Monitor mon = new Monitor("file1", "file2");
		mon.start();
	}
}
