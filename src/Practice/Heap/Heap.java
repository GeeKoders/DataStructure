package Practice.Heap;

public class Heap {
	
	private int[] heap ;
	
	private int heapSize ;
	
	public Heap() {
		this.heap = new int[Constants.CAPACITY] ;
	}
	
	public void insert(int item){
		
		if(isHeapFull()){
			throw new RuntimeException("Heap is full") ;
		}
		
		heap[heapSize++] = item ;
		
		fixUp(heapSize - 1) ;
		
	}
	
	private void fixUp(int index){
		
		int parentIndex = (index - 1)/2 ;
		
		if(index > 0 && heap[index] > heap[parentIndex]){
			swap(index, parentIndex) ;
			fixUp(parentIndex) ;
		}
	}
	
	public int poll(){
		
		int max = getMax() ;
		
		swap(0, heapSize - 1) ;
		this.heapSize-- ;
		
		fixDown(0) ;
		return max ;
		
	}
	
	private void fixDown(int index) {

		int indexLeft = 2 * index + 1 ;
		int indexRight = 2 * index + 2 ;
		
		int indexLargest = index ;
		
		if(indexLeft < heapSize && heap[indexLeft] > heap[index]){
			indexLargest = indexLeft ;
		}
		
		if(indexRight < heapSize && heap[indexRight] > heap[indexLargest]) {
			indexLargest = indexRight ;
		}
		
		if(indexLargest != index){
			swap(index, indexLargest) ;
			fixDown(indexLargest) ;
		}
		
	}

	public boolean isHeapFull(){
		return heapSize == Constants.CAPACITY ;
	}
	
	private void swap(int index, int parentIndex){
		int tmp = heap[index] ;
		heap[index] = heap[parentIndex] ;
		heap[parentIndex] = tmp ;
	}
	
	public int getMax(){
		return this.heap[0] ;
	}

}
