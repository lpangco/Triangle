import java.util.Scanner;
/*
* this program solves the towers of hanoi problem and print out the soving progress
*/
public class TowersOfHanoi {

	/*this function solve the towers of hanoi recursively
	* @param n number of disks
    * @param start is the starting pole
    * @param end is the end pole
    * @param temp is the temporary pole 
    */
	public void move(int n, String start, String temp, String end) {
		// base case: when n = 1, move disk from start to end
		if (n == 1) {
			System.out.println(start + " -> " + end);
		} 
		// recursive: 
		else {
			// move n-1 disk from start to the end, and let n-1 disk ends with the temp pole
			move(n - 1, start, end, temp);
			// print the current progress
			System.out.println(start + " -> " + end);
			// move n-1 disk from temp to end pole, use start pole as temporary one 
			move(n - 1, temp, start, end);
		}
	}

	public static void main(String[] args) {

		TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
		// prompt user to enter the number of disk
		System.out.print("Enter number of disks: ");
		// take user input
		Scanner scanner = new Scanner(System.in);
		int discs = scanner.nextInt();
		// call the function to make move and print result
		towersOfHanoi.move(discs, "A", "B", "C");
	}
}