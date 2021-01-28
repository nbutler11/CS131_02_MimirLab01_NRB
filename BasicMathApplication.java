/**
 * This class drives the BasicMath class by instantiating it and using the methods to perform mathematical operations with two integers
 * @author Nathan Butler
 * @version 1.0
 * Mimir Lab 1 BasicMathApplication class
 * 1/27/2021
 * Spring/2021
 */
public class BasicMathApplication {
	public static void main(String[] args) {
		BasicMath myNum = new BasicMath();
		
		System.out.println("The sum is: " + myNum.add(21, 7));
		System.out.println("The difference is: " + myNum.subtract(21, 7));
		System.out.println("The product is: " + myNum.multiply(21, 7));
		System.out.println("The quotient is: " + myNum.divide(21, 7));

	}

}
