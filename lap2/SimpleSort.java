package lap2;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleSort {

	int a[];
	int n;

	public SimpleSort(int[] a) {
		super();
		this.a = a;
		n = a.length;
	}

	public void display(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}

	public void selectionSort() {
		int[] b = Arrays.copyOfRange(a, 0, n);
		for (int i = 0; i < n; i++) {
			int minId = i;
			for (int j = i + 1; j < n; j++) {
				if (b[j] < b[minId]) {
					minId = j;
				}
			}
			int temp = b[i];
			b[i] = b[minId];
			b[minId] = temp;
		}
		display(b);
	}

	public void insertionSort() {
		int[] c = Arrays.copyOfRange(a, 0, n);

		for (int i = 0; i < n; i++) {
			int j = i - 1;
			int key = c[i];

			while (j >= 0 && c[j] > key) {
				c[j + 1] = c[j];
				j--;
			}
			c[j + 1] = key;
		}
		System.out.print("Sort result: ");
		display(c);
	}

	public void search(Scanner cs) {

		System.out.print("Enter value: ");
		int value = cs.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				System.out.println("Index: "+i);
			}
		}

	}

}
