package Practice.Heap;

public class HeapConverter {

	private int[] heap ;
	
	public static void main(String[] args) {
		
		int [] heap = {210,100,23,2,5};
		HeapConverter heapConverter = new HeapConverter(heap) ;
		int[] minHeap = heapConverter.transform() ;
		
		for(int i=0; i<minHeap.length; i++){
			System.out.print(minHeap[i] + " ");
		}
		
	}
	
	public HeapConverter(int []heap) {
		this.heap = heap ;
	}
	
	public int[] transform(){
	
		for(int i=(heap.length - 2)/2; i>=0; i--){
			heapify(i) ;
		}
		
		return heap ;
	}
	
	private void heapify(int index) {

		int indexLeft = 2 * index + 1 ;
		int indexRight = 2 * index + 2 ;
		
		int smallestIndex = index ;
		
		if(indexLeft < heap.length && heap[indexLeft] < heap[index]){
			smallestIndex = indexLeft ;
		}
		
		if(indexRight < heap.length && heap[indexRight] < heap[smallestIndex]){
			smallestIndex = indexRight ;
		}
		
		if(smallestIndex != index){
			swap(index, smallestIndex) ;
			heapify(smallestIndex) ;
		}
		
	}

	private void swap(int index, int smallestIndex) {
		int tmp = heap[index] ;
		heap[index] = heap[smallestIndex] ;
		heap[smallestIndex] = tmp ;
	}
}