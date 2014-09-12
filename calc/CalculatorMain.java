/*
 * Assignment - 1
 * Calculator main function
 */
package calc;

public class CalculatorMain {

	public static void main(String[] args) {
		
		//create instance s: 5.5
		SimpleCalculator s = new SimpleCalculator(5.5);
		s.add(4);
		s.add(8);
		
		System.out.println("Calculation 1 (simple) - Expected Value: 17.5, Calculated Value: " + s.getCurrentNumber() + "\n");
		
		//create instance c: 10.5
		ComplexCalculator c = new ComplexCalculator(10.5);
		c.add(2);
		c.subtract(3);
		c.multiply(8);
		c.add(2);
		c.divide(2);
		c.power(2);
		
		System.out.println("Calculation 2 (complex) - Expected Value: 1521.0, Calculated Value: " + c.getCurrentNumber());
		
		//set instance c: 0
		c.clear();
		c.add(5);
		c.subtract(3);
		c.power(4);
		c.divide(4);
		
		System.out.println("Calculation 2 (complex) - Expected Value: 4.0, Calculated Value: " + c.getCurrentNumber() + "\n");

		
		//Extra Function Implementation
		
		//set instance c: 0
		c.clear();
		c.add(4);
		
		System.out.println("Challenge 1 - Is " + c.getCurrentNumber() + " even?");
		System.out.println("Expected Answer: true, Calculated Answer: " + c.isEven() + "\n");
		
		c.add(3);
		
		System.out.println("Challenge 2 - Is " + c.getCurrentNumber() + " even?");
		System.out.println("Expected Answer: false, Calculated Answer: " + c.isEven() + "\n");
		
		/*System.out.println("Challenge 3 - Is " + c.getCurrentNumber() + " a prime number?");
		System.out.println("Expected Answer: true, Calculated Answer: " + c.isPrime() + "\n");
		
		c.add(1);
		
		System.out.println("Challenge 4 - Is " + c.getCurrentNumber() + " a prime number?");
		System.out.println("Expected Answer: false, Calculated Answer: " + c.isPrime());
		*/
	}

}
