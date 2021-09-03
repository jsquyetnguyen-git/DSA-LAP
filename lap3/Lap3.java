package lap3;

import java.util.Scanner;

public class Lap3 {

	public static void main(String[] args) {
		MyList mylist = new MyList();

		int a[] = { 7, 2, 9, 8, 6, 3 };

		for (int i = 0; i < a.length; i++) {
			mylist.addToHead(a[i]);
		}

		System.out.println("Display list: ");
		mylist.traverse();

		@SuppressWarnings("resource")
		Scanner cs = new Scanner(System.in);

		System.out.print("\nEnter value to search: ");
		int value = cs.nextInt();
		mylist.search(value);

	}

}
