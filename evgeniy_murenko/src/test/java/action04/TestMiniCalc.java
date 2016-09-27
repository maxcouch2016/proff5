package action04;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestMiniCalc {

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test1() {
		MiniCalc calc = new MiniCalc();
		int a = 12;
		int b = 4;
		int resTest = a + b;
		int resFact = calc.summa(a, b);
		if (resTest != resFact){
			fail("Trouble");
		}
	}
	@Test
	public void test2() {
		MiniCalc calc = new MiniCalc();
		int a = 2;
		int b = 4;
		int resTest = a + b;
		int resFact = calc.summa(a, b);
		if (resTest != resFact){
			fail("Trouble");
		}
	}
	
	@Test
	public void test3() {
		MiniCalc calc = new MiniCalc();
		int a = 0;
		int b = 4;
		int resTest = a + b;
		int resFact = calc.summa(a, b);
		if (resTest != resFact){
			fail("Trouble");
		}
	}
	
	@Test
	public void test4() {
		//assertArrayEquals(Integer[], Integer[]);
	}
	
	@Test
	public void checkIfResultMore100(){
		MiniCalc calc = new MiniCalc();
		int a = 60;
		int b = 70;
		calc.summa(a, b);
		
	}

}
