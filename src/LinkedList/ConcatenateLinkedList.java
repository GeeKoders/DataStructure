package LinkedList;

public class ConcatenateLinkedList {

	private ConcatenateNode first;

	private ConcatenateNode last;

	private int count = 0;
	
	public static void main(String[] args) {
		
		ConcatenateLinkedList concatenateLinkedList = new ConcatenateLinkedList() ;
		ConcatenateLinkedList concatenateLinkedList1 = new ConcatenateLinkedList() ;
		ConcatenateLinkedList concatenateLinkedList2 = new ConcatenateLinkedList() ;
		
		concatenateLinkedList1.insert(1);
		concatenateLinkedList1.insert(2);
		concatenateLinkedList1.insert(3);
		concatenateLinkedList1.insert(4);
		concatenateLinkedList1.insert(5);
		
		concatenateLinkedList2.insert(6);
		concatenateLinkedList2.insert(7);
		concatenateLinkedList2.insert(8);
		concatenateLinkedList2.insert(9);
		concatenateLinkedList2.insert(10);
		
		ConcatenateLinkedList result = concatenateLinkedList.contenate(concatenateLinkedList1, concatenateLinkedList2);
		result.print();
		
	}
	
	public boolean isEmpty() {
		return first == null;
	}

	public int size() {

		ConcatenateNode current = first;

		while (current != null) {
			count++;
			current = current.next ;
		}

		return count;

	}
	
	public void print(){
		
		ConcatenateNode current = first ;
		
		while(current != null){
			System.out.print(current.data + " ");
			current = current.next ;
		}
	}
	
	public void insert(int data){
		
		ConcatenateNode newNode = new ConcatenateNode(data) ; 
		
		if(isEmpty()){
			first = newNode ;
			last = newNode ;
		}else{
			last.next = newNode ;
			last = newNode ;
		}
	}
	
	public ConcatenateLinkedList contenate(ConcatenateLinkedList concatenateLinkedList1, ConcatenateLinkedList concatenateLinkedList2){
		
		ConcatenateNode current = concatenateLinkedList1.first ;
		
		while(current!=null){
			
			if(current == concatenateLinkedList1.last){
				concatenateLinkedList1.last.next = concatenateLinkedList2.first ;
			}
			
			current = current.next ;
		}
		
		return concatenateLinkedList1 ;
	}
	
}

class ConcatenateNode {

	public int data;

	public ConcatenateNode next;

	public ConcatenateNode(int data) {
		this.data = data;
		this.next = null;
	}

}

