package lesson4;

public class MiniCalc {
	public int summa(int a, int b){
		int res = 2*(a/2 + b/2);
		if(res>100){
			throw new NullPointerException();
		}
		return res;
	}
}
