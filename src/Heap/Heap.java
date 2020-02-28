package Heap;

public class Heap {

	// we represent the heap data structure with an array
	private int[] heap;
	// we want to track the size (the number of items in the heap)
	private int heapSize;

	public Heap() {
		this.heap = new int[Constants.CAPACITY];
	}

	// insertion takes O(1) running time But we have to make sure that the
	// heap properties are not violated (it takes O(logN)) because of the
	// fixUp() method)
	public void insert(int item) {

		// we are not able to insert more items than the value of the capacity
		if (isHeapFull())
			throw new RuntimeException("Heap is full...");

		// insert the item + increment the counter
		this.heap[heapSize] = item;
		heapSize++;

		// we insert the item to the last position of the array: of cource
		// the heap
		// properties may be violated so we have to fix it if necessary

		fixUp(heapSize - 1);

	}

	// we consider the last item and checks whether swaps are needed or not
	// running time: O(logN)
	private void fixUp(int index) {

		// the parent index of the given node in the heap
		// we store the heap in an array (!!!)
		int parentIndex = (index - 1) / 2;

		// while the index>0 means until we consider all the items "above" the
		// one we inserted
		// we have to swap the node with the parent if the heap property is
		// violated
		// it is a Max HEAP: largest items are in the higher layers (max item ==
		// root node)
		if (index > 0 && heap[index] > heap[parentIndex]) {
			swap(index, parentIndex);
			fixUp(parentIndex);
		}

	}

	// we return the root node. Because it is a max heap the root is the max
	// item
	// of course because of the array representation it takes O(1) item
	// this us the peek() method
	public int getMax() {
		return this.heap[0];
	}

	// it returns the maximum item + removes it from the heap
	// note: just do not care about that item any more but because
	// we have an array with fix size we are not able to get rid of it
	// completely
	public int poll() {

		int max = getMax();

		swap(0, heapSize - 1);
		this.heapSize--;

		fixDown(0);
		return max;
	}

	// we have a given item in the geap and we consider all the item BELOW and
	// check
	private void fixDown(int index) {

		// every node have children: left child and right child
		// in the array the node i has left child with index *i+1 and right
		// child with index 2*i+1
		int indexLeft = 2 * index + 1;
		int indexRight = 2 * index + 2;
		// max heap so the parent node is always greater than the children
		int indexLargest = index;

		// if the left child is greater than the parent: largest is the left
		// node
		if (indexLeft < heapSize && heap[indexLeft] > heap[index]) {
			indexLargest = indexLeft;
		}

		// if the right child is greater than the left child: largest is the
		// right node
		if (indexRight < heapSize && heap[indexRight] > heap[indexLargest]) {
			indexLargest = indexRight;
		}
		// we do not want to swap items with themselves
		if (index != indexLargest) {
			swap(index, indexLargest);
			fixDown(indexLargest);
		}
	}

	// we have N items and we want to sort them with a heap
	// every poll() operation takes O(logN) time because of the fixDown() method
	// thats why
	// the overall running time complexity is O(NlogN) for heapsort

	public void heapsort() {

		// we decrease the size of the heap in the poll() method so we have to
		// store it (!!!)
		int size = this.heapSize;

		for (int i = 0; i < size; i++) {
			int max = poll();
			System.out.print(max + " ");
		}

	}

	// swap two items in the heap array
	private void swap(int index, int parentIndex) {
		int tmp = heap[index];
		heap[index] = heap[parentIndex];
		heap[parentIndex] = tmp;
	}

	public boolean isHeapFull() {
		return this.heapSize == Constants.CAPACITY  ;
	}

}
