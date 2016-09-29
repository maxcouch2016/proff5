package action04;
//import static org.junit.Assert.*;

public class MiniCalc {
	public int summa(int a, int b){
		int res = 2*(a/2 + b/2);
		throw new NullPointerException();
		//return res;
	}
	public int multiply(int a, int b){
		int res = (a/2) * 2 * b;
		return res;
	}
	public int divide(int a, int b){
		return a/b; 
	}
}
