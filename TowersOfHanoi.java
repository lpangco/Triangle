import java.util.Scanner;

public class TowersOfHanoi {

	public void move(int n, String start, String temp, String end) {
		if (n == 1) {
			System.out.println(start + " -> " + end);
		} else {
			move(n - 1, start, end, temp);
			System.out.println(start + " -> " + end);
			move(n - 1, temp, start, end);
		}
	}

	public static void main(String[] args) {
		TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
		System.out.print("Enter number of discs: ");
		Scanner scanner = new Scanner(System.in);
		int discs = scanner.nextInt();
		towersOfHanoi.move(discs, "A", "B", "C");
	}
}