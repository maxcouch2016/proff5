//Создать целочисленный калькулятор класс Calc наследник AbstractCalc, в котором реализовать метод inChar
//Вводимые символы такие: цифры, +, -, *, /, =
//Будем считать, что ввод символов возможен только те, что мы определили - цифры, операции и равно.
//Последовательность ввода такая: число1 + операция + число2 + равно.

//Написать модульный тест для проверки:
//1) корректного введения первого числа
//2) корректного введения операции
//3) корректного введения второго числа(проверка результирующего значения)
//4) корректного введения знака "="(проверка результирующего значения)



package hwWeek2;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator extends Abstractcalc {
	String str1; 
	StringBuilder build;
	private int duble1;
	private double duble2;
		char operand;
	char [] tmp ;
	int count;
	
	public Calculator() {	
	str1 = "";
	build = new StringBuilder();
	}
	

	private void scanner(){
	System.out.println("enter number >>");
	Scanner scan = new Scanner(System.in);
	          String s = scan.next();
	          tmp = s.toCharArray();
	        
	 for (int i = 0; i < tmp.length; i++) {
		 if (Character.isDigit(tmp[i])){
			//char c = tmp[duble1];
			build = build.append(Character.toString(tmp[i]));
			str1 = build.toString();
			count++;
			
			
			if (tmp[i] == '/'){operand = '/';}
			if (tmp[i] == '*'){operand = '*';}	
			if (tmp[i] == '+'){operand = '+';}
			if (tmp[i] == '-'){operand = '-';}
		//	System.out.println(c);
		}
		
			} 
	 
	 System.out.println(count);
	 System.out.println(str1);
	}          
		
		 
	 
	
	
	
	
	public static void main(String[] args) {
		Calculator x = new Calculator();
		x.scanner();

	}	
	
}
