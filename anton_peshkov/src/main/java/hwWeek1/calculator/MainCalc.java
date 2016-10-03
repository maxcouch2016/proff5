package hwWeek1.calculator;

public class MainCalc {
    public static void main(String[] args) {
        Calculator calc = new MyCalc();
        calc.inChar('1'); calc.printResult();
        calc.inChar('2'); calc.printResult();
        calc.inChar('+'); calc.printResult();
        calc.inChar('0'); calc.printResult();
        calc.inChar('4'); calc.printResult();
        calc.inChar('0'); calc.printResult();
        calc.inChar('='); calc.printResult();
    }
}