package LinkedList;


/*
 * reference: https://www.youtube.com/watch?v=sYcOK51hl-A
 */

public class ReverseLinkedList {

	private ReverseNode first;

	private ReverseNode last;

	private int count = 0;

	public static void main(String[] args) {
		
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList() ;
		
		reverseLinkedList.insert(1);
		reverseLinkedList.insert(2);
		reverseLinkedList.insert(3);
		reverseLinkedList.insert(4);
		reverseLinkedList.insert(5);
		reverseLinkedList.print();
		reverseLinkedList.reverse();
		System.out.print("After reverse:");
		reverseLinkedList.print();
		
		
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {

		ReverseNode current = first;

		while (current != null) {
			count++;
			current = current.next ;
		}

		return count;

	}
	
	public void print(){
		
		ReverseNode current = first ;
		
		while(current != null){
			System.out.print(current.data + " ");
			current = current.next ;
		}
	}
	
	public void insert(int data){
		
		ReverseNode newNode = new ReverseNode(data) ; 
		
		if(isEmpty()){
			first = newNode ;
			last = newNode ;
		}else{
			last.next = newNode ;
			last = newNode ;
		}
	}
	
	public void reverse(){
		
		ReverseNode current = first ;
		ReverseNode prev = null ; 
		ReverseNode r = null ;
		
		while(current!=null){
			r = current.next ;
			current.next = prev ;
			prev = current ;
			current = r ;
		}
		
		first = prev ;
		
	}

}

class ReverseNode {

	public int data;

	public ReverseNode next;

	public ReverseNode(int data) {
		this.data = data;
		this.next = null;
	}

}
