/*
 * Some progress bars are circles. Assume we have a progress bar, that shows its progress as a sector of a circle. 
 * Imagine your screen as a square on the X, Y plane with its bottom-left corner at (0, 0), and its upper-right corner at (100, 100). 
 * Every point on the screen is either red or blue. Initially, the progress is 0%, and all points on the screen are blue. 
 * When the progress percentage, P, is greater than 0%, a sector of angle (P% * 360) degrees is colored red, a
 * nchored by the line segment from the center of the square to the center of the top side, and proceeding clockwise. 
 * Given the percentage completed and a point (X, Y), determine out whether that point will be red or blue.
 * 
 * This program takes P (percentage completed), X (x coordinate of a point) and Y (y coordinate of the same point) as arguments 
 * and prints “RED” or “BLUE” as output. RED if the given point will be colored red 
 * and BLUE if the given point will have blue color for P% progress.
 */
import java.util.Scanner;

public class ProgressBar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// keep looping to get user input for next point
		while (true) {
			// prompt user to input the perecentate, x coordinate and y coordinate for the point
			System.out.print("Enter the percentage (without %), x, and y: ");

			// take user inputs
	        int p = scan.nextInt();
	        int x = scan.nextInt();
	        int y = scan.nextInt();

	        // if user input is not in range, print error message
	        if (p < 0 || p > 100 || x < 0 || y < 0 || x > 100 || y > 100  || x == 50 && y == 50 ) {
				System.out.print("Input out of range!");
				continue;
			}

			// call the method to determine the color of the given point 
	        findColor(p, x, y);
	        
	        // ask user if they want to continue 
			System.out.print("Continue?(input N to quit) ");

			// take user input for the continue option 
			Scanner scanner = new Scanner(System.in);
			String cont = scanner.nextLine().toUpperCase();

			// if user choose not to continue, stop the loop
			if(cont.equals("N")) {
				break;
			}
		}	
	}
	
	/* the findColor method to take precentage, x coordinate and y coordinate of a point,
	* and print the given point's color
	* @param p takes a number as percentage (without %)
    * @param x is the x coordinate of a point
    * @param end is the y coordinate of a point
    */
	public static void findColor(int p, int x, int y) {
		// define center point
		int centerX = 50;
		int centerY = 50;

		// get distance from the given point to center 
		double ptX = x - centerX;
		double ptY = y - centerY;
		
		// convert precentage to degree
		double angleInDegree = p / 100.0 * 360;

		// convert degree to radian
		double angleInRadian = Math.toRadians(angleInDegree);

		// if percentage is 0%, then all points must be blue
		if (p == 0) {
			System.out.println("BLUE");
		}
		// if percentage is 100%, then all points must be red
		if (p == 100) {
			System.out.println("RED");
		}
		
		// if percentage is in a valid range
		else if(p > 0 && p < 100 ) {			
			// If point in first quadrant
			if(0 < p && p <= 25 && (ptY * Math.tan(angleInRadian) >= ptX)) {
				System.out.println("RED");
			} 
			// If point in second quadrant
			else if (25 < p && p <= 50 && (ptY * Math.tan(angleInRadian) <= ptX)){
				System.out.println("RED");
			} 
			// If point in third quadrant
			else if (50 < p && p <= 75 && (ptY * Math.tan(angleInRadian) <= ptX)) {
				System.out.println("RED");
			}
			// If point in forth quadrant
			else if (75 < p && p < 100 && (ptY * Math.tan(angleInRadian) >= ptX)){
				System.out.println("RED");
			} 
			//check 25% edge
			else if (p >= 25 && ptY == 0 && ptX > 0 ) { 
				System.out.println("RED");
			}
			//check 50% edge
			else if (p >= 50 && ptX == 0 && ptY < 0 ) {
				System.out.println("RED");
			}
			//check 75% edge
			else if (p >= 75 && ptY == 0 && ptX < 0 ) {
				System.out.println("RED");
			} else {
				System.out.println("BLUE");
			}
		}
		
	}
}
