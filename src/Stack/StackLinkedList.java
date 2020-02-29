package Stack;

public class StackLinkedList<T extends Comparable> {

	
	private Node<T> first ;
	
	private Node<T> last ;
	
	private int count ;
	
	public static void main(String[] args) {
		
		StackLinkedList<Integer>stack = new StackLinkedList<Integer>() ;
		//push method means insert at the beginning
		stack.push(1) ;
		stack.push(2) ;
		stack.push(3) ;
		stack.push(4) ;
		stack.push(5) ;
		
//		System.out.println(stack.count);
		//pop method means remove at the beginning
		System.out.println(stack.pop()) ;
		System.out.println(stack.pop()) ;
		
	}
	
	
	//O(1)
	public boolean isEmpty(){
		return first == null ;
	}
	
	//O(1)
	public int size(){
		return count ;
	}
	
	
	//O(1)
	public Node<T> push(T data){
		count++ ;
		Node<T> newNode = new Node<T>(data) ;
		if(isEmpty()){
			first = newNode ;
			last = newNode ;
		}else{
			newNode.next = first ;
			first = newNode ;
		}
		
		return newNode ;
	}
	
	//O(1)
	public T pop(){
		count -- ;
		Node<T> current = first ;
		first = current.next ;
		current.next = last.next ;
		return current.data ;
	}
	
	public Node<T> peek(){
		return first ;
	}
	
}

class Node<T extends Comparable>{
	
	public T data ;
	public Node<T> next ;
	
	public Node(T data){
		this.data = data ;
		this.next = null ;
	}
	@Override
	public String toString(){
		return this.data.toString() ;
	}
	
}