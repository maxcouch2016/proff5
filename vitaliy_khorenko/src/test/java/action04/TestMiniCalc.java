package action04;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMiniCalc {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test1(){
		MiniCalc calc = new MiniCalc();
		int a = 0;
		int b = 0;
		int resFact = calc.summa(a, b);
		int resTest = a + b;
		if(resTest!=resFact) fail("Trouble!");
	}
	
	@Test
	public void test2(){
		MiniCalc calc = new MiniCalc();
		int a = 1;
		int b = 1;
		int resFact = calc.summa(a, b);
		int resTest = a + b;
		if(resTest!=resFact) fail("Trouble!");
	}
	
	@Test
	public void test3(){
		MiniCalc calc = new MiniCalc();
		int a = 10;
		int b = 2;
		int resFact = calc.summa(a, b);
		int resTest = a + b;
		if(resTest!=resFact) fail("Trouble!");
	}
	
	@Test
	public void test4(){
		//assertArrayEquals(new Object[], new Object[]);
		//assertArrayEquals(new Object[], new Object[]);
	}
	
	@Test(expected=NullPointerException.class)
	public void chekIfResultMore100(){
		MiniCalc calc = new MiniCalc();
		int a = 60;
		int b = 70;
		int resFact = calc.summa(a, b);
	
	}
	

}
