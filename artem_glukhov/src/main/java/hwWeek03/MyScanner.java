package hwWeek03;

import java.util.Scanner;

public class MyScanner implements InterafaceMyScanner{
	
	public MyScanner(){
		
		
	};
	
	Scanner scan =new Scanner(System.in);

	@Override
	public void next() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double nextDouble() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasNextInt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasNextDouble() {
		// TODO Auto-generated method stub
		return false;
	}

}
