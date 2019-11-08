package LinkedList ;

public class InsertLinkedList <T> {

	private InsertNode <T> first ;
	private InsertNode <T> last ;
	private int count = 0 ;
	
	
	public static void main(String[] args) {
		InsertLinkedList InsertLinkedList = new InsertLinkedList<>() ;
		System.out.println("=========InsertLinkedList insert tail start===========") ;
		System.out.println(InsertLinkedList.isEmpty()) ;
		InsertLinkedList.insertT(5);
		InsertLinkedList.insertT(2);
		InsertLinkedList.insertT(3);
		InsertLinkedList.insertT(4);
		InsertLinkedList.insertT(1);
		System.out.println(InsertLinkedList.isEmpty()) ;
		InsertLinkedList.print();
		System.out.println("size:" + InsertLinkedList.size()) ;
//		System.out.println("=========InsertLinkedList insert head start===========") ;
//		
//		InsertLinkedList.insertH(6);
//		InsertLinkedList.insertH(8);
//		InsertLinkedList.insertH(9);
//		InsertLinkedList.print();
//		System.out.println("size:" + InsertLinkedList.size()) ;
		
		InsertLinkedList.insertM(3, 6); //5 2 3 6 4 1 
		InsertLinkedList.insertM(6, 7); //5 2 3 6 7 4 1
		InsertLinkedList.insertM(8, 9); //Can't find target node
		InsertLinkedList.print();
		
	}
	
	public void print(){
		
		InsertNode <T> current = first ;
		
		while(current!=null){
			System.out.println(current.data);
			current = current.next ;
		}
	}
	
	public int size(){
		
		InsertNode <T> current = first ;
		
		while(current!=null){
			count++ ;
			current = current.next ;
		}
		
		return count ;
	}
	
	//O(1)
	public void insertH(T data){
		
		InsertNode <T> newNode = new InsertNode<>(data) ;
		
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
		
		InsertNode <T> newNode = new InsertNode<>(data) ;
		
		if(isEmpty()){
			first = newNode ;
			last = newNode ;
		}else{
			last.next = newNode ;
			last = newNode ;
		}
	}
	
	public void insertM(T target, T data){
		InsertNode <T> newNode = new InsertNode<>(data) ;
		
		if(isEmpty()){
			first = newNode ; 
			last = newNode ; 
		}else{
			
			InsertNode <T> current = first ;
			InsertNode <T> previous = first ;
			try{
				while(current.data != target){
					current = current.next ;
				}
				
				newNode.next = current.next ;
				current.next = newNode ;
			}catch(Exception e){
				System.out.println("Can't find target node");
			}
		}
	}
	
	
	public boolean isEmpty(){
		return first == null ;
	}

}

class InsertNode<T>{
	
	public T data ;
	public InsertNode<T> next;
	
	public InsertNode(T data) {
		this.data = data ;
		this.next = null;
	}
}
