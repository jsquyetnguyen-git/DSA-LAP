package lap1;

import java.util.Scanner;

public class Lap1 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);

		System.out.print("Nhap vao so phan tu: ");
		int n = cs.nextInt();

		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]: ");
			b[i] = cs.nextInt();
		}

		SimpleSort s = new SimpleSort(b);

		System.out.println("Output:");
		s.bubbleSort();
	}

}
