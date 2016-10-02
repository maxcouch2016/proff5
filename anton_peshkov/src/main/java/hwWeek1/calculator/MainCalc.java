package calculator;

public class MainCalc {
    public static void main(String[] args) {
        Calculator calc = new MyCalc();
        calc.inChar('1'); calc.printResult();
        calc.inChar('2'); calc.printResult();
        calc.inChar('+'); calc.printResult();
        calc.inChar('3'); calc.printResult();
        calc.inChar('4'); calc.printResult();
        calc.inChar('5'); calc.printResult();
        calc.inChar('='); calc.printResult();
    }
}