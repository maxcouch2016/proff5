package hwWeek2;

public abstract class Abstractcalc  {
	 private int result;
	 private String temp1 ;
	 private String temp2 ;
	 private char operand;
	 
	 
	 
	 Abstractcalc(){
		 this.temp1 = "";
		 this.temp2 = "";
	 }
	 
	 
	 
	public String getTemp1() {
		return temp1;
	}
	public void setTemp1(String temp1) {
		this.temp1 = temp1;
	}
	public String getTemp2() {
		return temp2;
	}
	public void setTemp2(String temp2) {
		this.temp2 = temp2;
	}
	public char getOperand() {return operand; 	}
	public void setOperand(char operand) { 		this.operand = operand; 	}
	public void setResult(int result) { 		this.result = result;	}
		
	public void printResult(){
		System.out.println("Result = "+ result );
	}
	public String getResult(String res){
	    	return res;
	    	}
	    public void inChar(char ch) {
		}
	

	
	
}
