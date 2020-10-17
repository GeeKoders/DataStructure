package Practice.Heap;

public class CheckHeap {
	
	public static void main(String[] args) {
		
		CheckHeap checkHeap = new CheckHeap() ;
		int[] heap = { 10, 14, 19, 26, 31, 42, 27, 44, 35, 33, 35 };

		System.out.println(checkHeap.isMinHeap(heap));
	}
	
	public boolean isMinHeap(int[] heap){
		
		for(int i=0; i<=(heap.length - 2)/2 ; i++){

			if(heap[i]>heap[2*i+1] || heap[i] > heap[2*i+2]){
				return false ;
			}
		}
		
		return true ;
		
	}
}
