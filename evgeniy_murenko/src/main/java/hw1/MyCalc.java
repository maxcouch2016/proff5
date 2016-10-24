package hw1;

public class MyCalc extends AbstractCalc {
	private boolean secondValue = false;

	@Override
	public void inChar(char p) {
		if (p == '1' || p == '2' || p == '3' || p == '4' || p == '5' || p == '6' || p == '7' || p == '8' || p == '9'
				|| p == '0') {
			if (secondValue == true) {
				result = "";
				secondValue = false;
			}
			if (result == null) {
				result = "" + p;
			} else {
				result += p;
			}
		}
		if (p == '+' || p == '-' || p == '*' || p == '/') {
			operation = p;
			temp = Integer.parseInt(result);
			secondValue = true;
		}
		if (p == '=') {
			if ((result != null) && (temp != 0)) {
				if (operation == '+') {
					result = Integer.toString(Integer.parseInt(result) + temp);
					//operation = ' ';
				} else if (operation == '-') {
					result = Integer.toString(Integer.parseInt(result) - temp);
					//operation = ' ';
				} else if (operation == '*') {
					result = Integer.toString(Integer.parseInt(result) * temp);
					//operation = ' ';
				} else if (operation == '/') {
					result = Integer.toString(Integer.parseInt(result) / temp);
					//operation = ' ';
				}
			}
		}

	}

}
