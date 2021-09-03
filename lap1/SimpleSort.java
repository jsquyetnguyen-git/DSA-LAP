package lap1;

public class SimpleSort {

	int a[];

	public SimpleSort(int[] b) {
		a = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	}

	public void display() {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public void bubbleSort() {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			display();
		}
	}

}
