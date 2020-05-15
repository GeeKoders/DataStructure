package QuickSort;

public class App {

	public static void main(String[] args) {

		int nums[] = { 1, 5, 3, 7, 6, 9, 8, 3, 2 };

		QuickSort quicksort = new QuickSort(nums);
		quicksort.sort();
		quicksort.showArray();

	}

}
