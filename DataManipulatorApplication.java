/**
 * This class drives the DateManipulator class by instantiating it and using the isLeapYear method with multiple years.
 * @author Nathan Butler
 * @version 1.0
 * Mimir Lab 1 DateManipulatorApplication class
 * 1/27/2021
 * Spring/2021
 */
public class DataManipulatorApplication {
	public static void main(String[] args) {
		DateManipulator year = new DateManipulator();
		
		System.out.println(year.isLeapYear(1400));
		System.out.println(year.isLeapYear(2004));
		System.out.println(year.isLeapYear(1900));
		System.out.println(year.isLeapYear(1783));

	}//end main

}//end class
