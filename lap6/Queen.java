package lap6;

public class Queen {

	int n;
	int x = 1;

	public Queen(int n) {
		super();
		this.n = n;
	}

	public void init(int n) {
		int[] array = new int[n];
		placeQueen(array, 0, n);
	}

	public void placeQueen(int arr[], int current, int n) {
		//the base 
		//current la cot hien tai, chi so cua mang board
		if (current == n) {
			System.out.print(x + ":  ");
			x++;
			showResult(arr);
			return;
		}

		for (int i = 0; i < n; i++) {
			arr[current] = i+1; // dat so hang
			if (test(arr, current)) {
				placeQueen(arr, current + 1, n);
			}
		}
	}

	
	public boolean test(int[] arr, int current) {
		for (int i = 0; i < current; i++) {
			// neu cung hang thi dat la false
			if (arr[i] == arr[current])
				return false;

			// Diagonal
			if ((current - i) == Math.abs(arr[current] - arr[i])) {
				return false;
			}
		}
		return true;
	}

	public void showResult(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + "  ");
		}
		System.out.println();
	}
}
