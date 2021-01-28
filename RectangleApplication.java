/**
 * This class drives the rectangle class by instantiating two rectangles and using the getLength, getWidth, 
 calculateArea, and calculatePerimeter. This class prints those values from the methods.
 *
 * @author Nathan Butler
 * @version 1.0
 * Mimir Lab 1 RectangleApplication class
 * 1/27/2021
 * Spring/2021
 */
public class RectangleApplication {
	public static void main(String[] args) {
		Rectangle myRec = new Rectangle();
		Rectangle rec2 = new Rectangle(16, 42);
		
		System.out.println("The length of myRec is: " + rec2.getLength());
		System.out.println("The width of myRec is : " + rec2.getWidth());
		System.out.println("The area of rec2 is: " + rec2.calculateArea());
		System.out.println("The perimeter of rec2 is: " + rec2.calculatePerimeter());

	}//end main

}//end class
