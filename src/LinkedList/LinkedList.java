package LinkedList ;

public class LinkedList <T> {

	private Node <T> first ;
	private Node <T> last ;
	
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList<>() ;
		System.out.println("=========LinkedList insert tail start===========") ;
		System.out.println(linkedList.isEmpty()) ;
		linkedList.insertT(5);
		linkedList.insertT(2);
		linkedList.insertT(3);
		linkedList.insertT(4);
		linkedList.insertT(1);
		System.out.println(linkedList.isEmpty()) ;
		linkedList.print();
		System.out.println("=========LinkedList insert head start===========") ;
		
		linkedList.insertH(6);
		linkedList.insertH(8);
		linkedList.insertH(9);
		linkedList.print();
		
		
		
	}
	
	public void print(){
		
		Node <T> newNode = first ;
		
		while(newNode!=null){
			System.out.println(newNode.data);
			newNode = newNode.next ;
		}
	}
	
	//O(1)
	public void insertH(T data){
		
		Node <T> newNode = new Node<>(data) ;
		
		if(isEmpty()){
			first = newNode ;
			last = newNode ;
		}else{
			newNode.next = first ;
			first = newNode ;
		}
		
	}
	
	
	
	
	//O(N)
	public void insertT(T data){
		
		Node <T> newNode = new Node<>(data) ;
		
		if(isEmpty()){
			first = newNode ;
			last = newNode ;
		}else{
			last.next = newNode ;
			last = newNode ;
		}
	}
	
	public boolean isEmpty(){
		return first == null ;
	}

}

class Node<T>{
	
	public T data ;
	public Node<T> next;
	
	public Node(T data) {
		this.data = data ;
		this.next = null;
	}
}
