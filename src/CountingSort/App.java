package CountingSort;

public class App {

	public static void main(String[] args) {

		int[] nums = { 2, 5, 3, 2, 2, 2, 4, 5 };

		CountingSort countingSort = new CountingSort(nums);
		countingSort.countingSort(2, 5);
		countingSort.showArray();

	}

}
