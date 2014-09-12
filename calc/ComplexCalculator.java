/*
 * Assignment - 1
 * ComplexCalculator class
 */

package calc;

public class ComplexCalculator {

	private double currentNumber;
	
	/* constructor
	 * instance variables: currentNumber
	*/
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	/* method add()
	 * returns nothing
	 * adds a given number (double) to the current number (double)
	 */
	public void add(double d) {
		currentNumber = currentNumber + d;
	}
	
	/* method subtract()
	 * returns nothing
	 * subtracts a given number (double) from the current number
	 */
	public void subtract(double d) {
		currentNumber -= d;
	}
	
	/* method multiply()
	 * returns nothing
	 * multiplies the current number (double) by a given number (double)
	 */
	public void multiply(double d) {
		currentNumber *= d;
	}
	
	/* method divide()
	 * returns nothing
	 * divides the current number (double) by a given number (double)
	 */
	public void divide(double d) {
		currentNumber /= d;
	}
	
	/* method clear()
	 * returns nothing
	 * sets the current number (double) to 0
	 */
	public void clear() {
		currentNumber = 0;
	}
	
	/* method power()
	 * returns nothing
	 * raises the current number (double) to the power of a given number (double)
	 */
	public void power(double d) {
		//currentNumber = Math.pow(currentNumber, d);
		double n = currentNumber;
		for (double i=1; i < d; i++) {
			currentNumber = n * currentNumber;
		}
	}
			
	
	/* method getCurrentNumber()
	 * returns the current number (double)
	 */
	public double getCurrentNumber() {
		return currentNumber;
	}
	
	

	/* method isEven()
	 * returns a boolean
	 * true if current number is even, false otherwise
	 */
	public boolean isEven() {
		double d = getCurrentNumber();
		boolean result = false; //default is false
		if (d%2 == 0){
			result = true;
		}
		return result;
	}
	
	/*method isPrime()
	 * returns a boolean
	 * true if the current number is prime, false otherwise
	 */
	/*public boolean isPrime() {
		double d = getCurrentNumber();
		boolean result = false; //default is false
		if (d%2 != 0) {
			result = true;
		}
		return result;
	}*/
	
}
