/**
 * This class contains methods that perform math operations on two integers.
 * @author Nathan Butler
 * @version 1.0
 * Mimir Lab 1 BasicMath class
 * 1/27/2021
 * Spring/2021
 */
public class BasicMath {
	
	/**
	 * Empty constructor
	 */
	public BasicMath(){
	}//end empty constructor
	
	/**
	 * Takes two integer values and adds them
	 * @param a integer value used in calculations
	 * @param b integer value used in calculations
	 * @return the sum of two integers
	 */
	public static int add(int a, int b){
		int sum = a+b;
		return sum;
	}//end add
	
	/**
	 * Takes two integers and subtracts them
	 * @param a integer value used in calculations
	 * @param b integer value used in calculations
	 * @return the difference of two integers
	 */
	public static int subtract(int a, int b){
		int diff= a-b;
		return diff;
	}//end subtract
	
	/**
	 * Takes two integers and multiplies them
	 * @param a integer value used in calculations
	 * @param b integer value used in calculations
	 * @return the product of two integers
	 */
	public static int multiply(int a, int b){
		int product = a*b;
		return product;
	}//end multiply
	
	/**
	 * Takes two integers and divides them
	 * @param a integer value used in calculations
	 * @param b integer value used in calculations
	 * @return the quotient of two integers
	 */
	public static double divide(int a, int b){
		double quotient = (double) a/b;
		return quotient;
	}//end divide
}//end class

