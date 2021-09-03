package lap6;

import java.util.Scanner;

public class Lap6 {

	public static void main(String[] args) {
		int n = 0;
		Scanner cs = new Scanner(System.in);
		System.out.print("Enter n:");

		n = cs.nextInt();
		Queen queen = new Queen(n);
		queen.init(n);
	}
}
