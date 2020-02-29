package Queue;

public class Queue<T> {

	private Node<T> first;

	private Node<T> last;

	private int count;

	public static void main(String[] args) {

		Queue<Integer> queue = new Queue<>();

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);

		System.out.println(queue.size());
		queue.traverse();

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}
	//O(1) enqueue method means insert at the tail
	public void enqueue(T data) {

		Node<T> newNode = new Node<T>(data);

		count++;

		if (isEmpty()) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
	}
	//O(1) dequeue means remove at the beginning
	public T dequeue() {

		count--;

		Node<T> current = first;

		if (isEmpty()) {
			System.out.println("There is no node to dequeue");
			return null ;
		} else {
			first = first.next;
			current.next = last.next;
		}
		return current.data;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return count;
	}

	public void traverse() {

		Node<T> current = first;

		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}

class Node<T> {

	public T data;

	public Node<T> next;

	public Node(T data) {
		this.data = data;
		this.next = null;
	}

}
