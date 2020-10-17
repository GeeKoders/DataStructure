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
