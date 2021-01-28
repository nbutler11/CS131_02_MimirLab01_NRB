/**
 * This class contains methods that will take a rectangle and return the length and width of rectangle then 
 calculate the area and perimeter.
 * 
 * @author Nathan Butler
 * @version 1.0
 * Mimir Lab 1 Rectangle Class
 * 1/27/2021
 * Spring/2021
 */
public class Rectangle {
	private int length; //length of the rectangle
	private int width; //width of the rectangle
	
	/**
	 * Constructor sets an initial rectangle width and length to 1
	 */
	public Rectangle() {
		length = 1;
		width = 1;
	}//end constructor
	
	/**
	 * Sets a rectangle to a length and width by calling the parameters
	 * 
	 * @param l the length of the rectangle
	 * @param w the width of the rectangle
	 */
	public Rectangle(int l, int w) {
		length = l;
		width = w;
	}//end constructor
	
	/**
	 * Finds the width of the rectangle
	 * 
	 * @return the width of the rectangle
	 */
	public int getWidth() {
		return width;
	}//end getWidth
	
	/**
	 * Finds the length of the rectangle
	 * @return the length of the rectangle
	 */
	public int getLength() {
		return length;
	}//end getLength
	
	/**
	 * Calculates the area of the rectangle by multiply the length and width
	 * @return the area of the rectangle
	 */
	public int calculateArea() {
		int area = length*width;
		return area;
	}//end calculateArea
	
	/**
	 * Calculates the perimeter by adding the side lengths of the rectangle
	 * @return the perimeter of the rectangle
	 */
	public int calculatePerimeter() {
		int perimeter = 2*length + 2*width;
		return perimeter;
	}//end calculatePerimeter
	
}//end class
