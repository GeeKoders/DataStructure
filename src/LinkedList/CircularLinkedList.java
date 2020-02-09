package LinkedList;

public class CircularLinkedList {

	private CircularNode first;

	private CircularNode last;

	private int count = 0;

	public static void main(String[] args) {

		CircularLinkedList circularLinkedList = new CircularLinkedList();

		// circularLinkedList.insertH(1);
		// circularLinkedList.insertH(2);
		// circularLinkedList.insertH(3);

//		circularLinkedList.insertT(1);
//		circularLinkedList.insertT(2);
//		circularLinkedList.insertT(3);
//		circularLinkedList.insertT(4);
//		circularLinkedList.insertT(5);
//		circularLinkedList.insertM(6, 3);

		circularLinkedList.print();

	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {

		CircularNode current = first;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public void print() {
		CircularNode current = first;

		int count = 0;

		while (current != null) {
			System.out.print(current.data + " ");
			count++;
			current = current.next;

			if (count > 7)
				break; // avoid to infinite loop
		}
	}

	public void insertH(int data) {

		CircularNode newNode = new CircularNode(data);

		if (isEmpty()) {
			first = newNode;
			last = newNode;
			last.next = newNode;
		} else {
			newNode.next = first;
			first = newNode;
			last.next = newNode;
		}

	}

	public void insertT(int data) {

		CircularNode newNode = new CircularNode(data);

		if (isEmpty()) {
			first = newNode;
			last = newNode;
			last.next = newNode;
		} else {
			last.next = newNode;
			last = newNode;
			newNode.next = first;
		}

	}

	public void insertM(int data, int target) {

		CircularNode newNode = new CircularNode(data);

		CircularNode current = first;

		while (current != null && current.data != target) {
			current = current.next;
		}

		newNode.next = current.next;
		current.next = newNode;
		last.next = first;

	}

}

class CircularNode {

	public int data;

	public CircularNode next;

	public CircularNode(int data) {
		this.data = data;
		this.next = null;
	}

}
