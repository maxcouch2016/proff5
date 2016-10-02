package calculator;

//     Создать целочисленный калькулятор класс Calc наследник AbstractCalc, в котором реализовать метод inChar
//     Вводимые символы такие: цифры, +, -, *, /, =
//     Будем считать, что ввод символов возможен только те, что мы определили - цифры, операции и равно.
//     Последовательность ввода такая: число1 + операция + число2 + равно.

public class MyCalc extends AbstractCalc {

	@Override
	public void inChar(char p) {
		if ((p >= '\u0030') && (p <= '\u0039')) {
			createNumber(p);
		} else if (p == '+' || p == '-' || p == '*' || p == '/') {
			operation(p);
		} else if (p == '=') {
			result();
		} else {
			throw new NumberFormatException(String.valueOf(p));
		}
	}

	private void createNumber(char p) {
		if(result==null || result.equals(String.valueOf(operation))){
			result="";
		}
		result += String.valueOf(p);
	}

	private void operation(char p) {
		operation = p;
		temp = Integer.parseInt(result);
		result = String.valueOf(operation);
	}

	private void result() {
		int tmp = Integer.parseInt(result);

		switch (operation) {
		case '+':
			result = String.valueOf(temp + tmp);
			break;
		case '-':
			result = String.valueOf(temp - tmp);
			break;
		case '*':
			result = String.valueOf(temp * tmp);
			break;
		case '/':
			result = String.valueOf(temp / tmp);
			break;
		}
		operation = '\u0000';
	}
}