package Heap;

public class APP {

	public static void main(String[] args) {

		// Heap heap = new Heap() ;
		//
		// heap.insert(10);
		// heap.insert(8);
		// heap.insert(12);
		// heap.insert(20);
		// heap.insert(-2);
		// heap.insert(0);
		// heap.insert(1);
		// heap.insert(321);

		// System.out.println(heap.poll());
		// System.out.println(heap.poll());
		// System.out.println(heap.poll());
		// System.out.println(heap.poll());
		// System.out.println(heap.poll());
		// System.out.println(heap.poll());
		// System.out.println(heap.poll());
		// System.out.println(heap.poll());

		// heap.heapsort() ;

//		CheckHeap checkHeap = new CheckHeap();
//
//		int[] array = { 10, 14, 19, 26, 31, 42, 27, 44, 35, 33, 35 };
//
//		System.out.println(checkHeap.isMinHeap(array));
		
		
		int[] maxHeap = {210,100,23,2,5};
		
		HeapConverter heapConverter = new HeapConverter(maxHeap);
		
		int[] minHeap = heapConverter.transform();
		
		for(int i=0;i<minHeap.length;i++)
			System.out.print(minHeap[i]+" ");
		
		
		

	}

}
