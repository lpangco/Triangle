/*
 * Some progress bars are circles. Assume we have a progress bar, that shows its progress as a sector of a circle. 
 * Imagine your screen as a square on the X, Y plane with its bottom-left corner at (0, 0), and its upper-right corner at (100, 100). 
 * Every point on the screen is either red or blue. Initially, the progress is 0%, and all points on the screen are blue. 
 * When the progress percentage, P, is greater than 0%, a sector of angle (P% * 360) degrees is colored red, a
 * nchored by the line segment from the center of the square to the center of the top side, and proceeding clockwise. 
 * Given the percentage completed and a point (X, Y), determine out whether that point will be red or blue.
 * 
 * Write a function that takes P (percentage completed), X (x coordinate of a point) and Y (y coordinate of the same point) as arguments 
 * and prints RED or BLUE as output. RED if the given point will be colored red and BLUE if the given point will have blue color for P% progress.
 */
import java.util.Scanner;

public class ProgressBar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//String cont = "Y";
		while (true) {
			System.out.print("Enter the percentage (without %), x, and y: ");
	        int p = scan.nextInt();
	        int x = scan.nextInt();
	        int y = scan.nextInt();
	        if (p < 0 || p > 100 || x < 0 || y < 0 || x > 100 || y > 100  || x == 50 && y == 50 ) {
				System.out.print("Input out of range!");
				continue;
			}
	        findColor(p, x, y);
	        
			System.out.print("Continue?(Y/N) ");
			Scanner scanner = new Scanner(System.in);
			String cont = scanner.nextLine().toUpperCase();
			if(cont.equals("N")) {
				break;
			}
		}	
	}
	
	public static void findColor(int p, int x, int y) {
		int centerX = 50;
		int centerY = 50;
		double ptX = x - centerX;
		double ptY = y - centerY;
		
		double angleInDegree = p / 100.0 * 360;
		System.out.println("Degree: "+angleInDegree);

		double angleInRadian = Math.toRadians(angleInDegree);
		System.out.println("radian: "+angleInRadian);

		double cos = Math.cos(angleInRadian); 
		if (p == 0) {
			System.out.println("BLUE");
		}
		if (p == 100) {
			System.out.println("RED");
		}
		
		else if(p > 0 && p < 100 ) {			
			// If in first quadrant
			if(0 < p && p <= 25 && (ptY * Math.tan(angleInRadian) >= ptX)) {
				System.out.println("RED");
			} 
			// second quadrant
			else if (25 < p && p <= 50 && (ptY * Math.tan(angleInRadian) <= ptX)){
				System.out.println("RED");
			} 
			// Third quadrant
			else if (50 < p && p <= 75 && (ptY * Math.tan(angleInRadian) <= ptX)) {
				System.out.println("RED");
			}
			// Forth quadrant
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
