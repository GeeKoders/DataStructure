package LinkedList;

public class RemoveLinkedList<T> {

	private RemoveNode<T> first;
	private RemoveNode<T> last;

	public static void main(String[] args) {
		RemoveLinkedList removeLinkedList = new RemoveLinkedList<>();

		System.out.println(removeLinkedList.isEmpty());
		removeLinkedList.insertT(1);
		removeLinkedList.insertT(6);
		removeLinkedList.insertT(8);
		removeLinkedList.insertT(7);

		System.out.println("=========removeLinkedList remove head start===========");

		removeLinkedList.removeH();
		System.out.println("first removed:") ;
		removeLinkedList.print();
		
		System.out.println("=========removeLinkedList remove tail start===========");
		removeLinkedList.removeT();
		removeLinkedList.print();
	}

	public void print() {

		RemoveNode<T> current = first;

		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	// O(N)
	public void insertT(T data) {

		RemoveNode<T> newNode = new RemoveNode<>(data);

		if (isEmpty()) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
	}

	// O(1)
	public void removeH(){
		
		RemoveNode<T> current = first ;

		if (isEmpty()) {
			System.out.println("No nodes to remove.");
		} else {
			first = first.next ;
		}

	}
	// O(N)
	public void removeT(){
		RemoveNode<T> current = first ;
		RemoveNode<T> previous = first ;

		if (isEmpty()) {
			System.out.println("No nodes to remove.");
		} else {
			
			while(current.next != null){
				previous = current ;
				current = current.next ;
			}
			previous.next = current.next ;
		}
	}

	public boolean isEmpty() {
		return first == null;
	}

}

class RemoveNode<T> {

	public T data;
	public RemoveNode<T> next;

	public RemoveNode(T data) {
		this.data = data;
		this.next = null;
	}
}
