/**
 * The class uses one method of calculateDistance to find the distance between two (x,y) coordinate points.
 * @author Nathan Butler
 * @version 1.0
 * Mimir Lab 1 DistanceCalculator class
 * 1/27/2021
 * Spring/2021
 */
public class DistanceCalculator {
	
	/**
	 * Empty constructor
	 */
	public DistanceCalculator() {
		
	}//end empty argument constructor
	
	/**
	 * Takes 2 points and their coordinates to use distance formula to calculate distance between points
	 * @param x the x coordinate for point a
	 * @param y the y coordinate for point a
	 * @param a the x coordinate for point b
	 * @param b the y coordinate for point b
	 * @return the distance between point a and b
	 */
	public static double calculateDistance(int x, int y, int a, int b) {
		double Distance = Math.sqrt(Math.pow((x-a),2)+Math.pow((y-b),2));
		return Distance;
	}//end calculateDistance
	
}//end class

