/**
 * Class drives the DistanceCalculator class by instantiating the class and passing 4 integer values of the 2 points to the calculateDistance method.
 The method then calculates the distances.
 * @author Nathan Butler
 * @version 1.0
 * Mimir Lab 1 DistanceCalculatorApplication class
 * 1/27/2021
 * Spring/2021
 */
public class DistanceCalculatorApplication {
	public static void main(String[] args) {
		DistanceCalculator line = new DistanceCalculator();
		
		System.out.println("The distance between point a and b is: " + line.calculateDistance(4,2,5,9));

	}//end main

}//end class
