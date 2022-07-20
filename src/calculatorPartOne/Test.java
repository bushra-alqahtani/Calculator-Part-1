package calculatorPartOne;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		
		
		c.setOperandOne(10.5);

		c.setOperation("+");

		c.setOperandTwo(5.2);

		c.performOperation();

		c.getResults();
	}

}
