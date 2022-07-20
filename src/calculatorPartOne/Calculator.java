package calculatorPartOne;

public class Calculator {

	public double operandOne;
	public String operation;
	public double operandTwo;
	public double result;
	
	
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	
	public double performOperation() {
		if (operation.equals("+")){
			return this.result=this.operandOne + this.operandTwo;
			
		} else if (operation.equals("-")){
				return this.result=this.operandOne - this.operandTwo;
			
		}else {
			System.out.println("enter + or - to calculate");
		}
		return 0;
	}
	
	
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public void getResults() {
		System.out.println( result);
	}
	
	
	
	


	
	
}
