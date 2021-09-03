package lap2;

import java.util.Scanner;

public class Lap2 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		int a[] = {5,7,11,3,9,2,6};

		SimpleSort simplesort = new SimpleSort(a);

		do {
			System.out.println("\nMenu: ");
			System.out.println(" 1. Display data");
			System.out.println(" 2. Selection sort");
			System.out.println(" 3. Insertion sort");
			System.out.println(" 4. Search");
			System.out.print("Choose your option: ");
			int functionID = cs.nextInt();

			switch (functionID) {
			case 1:
				simplesort.display(a);
				break;
			case 2:
				simplesort.selectionSort();
				break;
			case 3:
				simplesort.insertionSort();
				break;
			case 4:
				simplesort.search(cs);
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}

		} while (true);

	}

}
