package LinkedList;

public class DoubleLinkedList {

	private DoubleNode first;

	private DoubleNode last;

	private int count = 0;

	public static void main(String[] args) {

		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

		// doubleLinkedList.insertH(1);
		// doubleLinkedList.insertH(2);
		// doubleLinkedList.insertH(3);
		// doubleLinkedList.insertH(4);
		// doubleLinkedList.insertH(5);

		doubleLinkedList.insertT(1);
		doubleLinkedList.insertT(2);
		doubleLinkedList.insertT(3);
		doubleLinkedList.insertT(4);
		doubleLinkedList.insertT(5);

		// doubleLinkedList.print();
		//
		// System.out.println("size:" + doubleLinkedList.size());
		//
		// doubleLinkedList.insertM(6, 3);
		//
		// doubleLinkedList.print();

		System.out.println("===========================");

		// doubleLinkedList.removeH();

		// doubleLinkedList.removeT();

		doubleLinkedList.removeM(0);
		doubleLinkedList.print();

	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {

		DoubleNode current = first;

		while (current != null) {
			count++;
			current = current.rNext;
		}
		return count;
	}

	public void print() {

		DoubleNode current = first;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.rNext;
		}
	}

	public void insertH(int data) {

		DoubleNode newNode = new DoubleNode(data);

		if (isEmpty()) {
			first = newNode;
			first.rNext = last;
			last = newNode;
			last.lNext = first;
			// newNode.lNext = null; redundant
			// newNode.rNext = null; redundant
		} else {
			first.lNext = newNode;
			newNode.rNext = first;
			first = newNode;
			// newNode.lNext = null; redundant
		}

	}

	public void insertT(int data) {

		DoubleNode newNode = new DoubleNode(data);

		if (isEmpty()) {
			first = newNode;
			first.rNext = last;
			last = newNode;
			last.lNext = first;
			// newNode.lNext = null; redundant
			// newNode.rNext = null; redundant
		} else {
			newNode.lNext = last;
			last.rNext = newNode;
			last = newNode;
			// newNode.rNext = null; redundant
		}
	}

	public void insertM(int data, int target) {

		DoubleNode newNode = new DoubleNode(data);
		DoubleNode current = first;
		DoubleNode r = null;

		if (isEmpty()) {
			first = newNode;
			first.rNext = last;
			last = newNode;
			last.lNext = first;
			// newNode.lNext = null; redundant
			// newNode.rNext = null; redundant
		} else {
			while (current != null && current.data != target) {
				current = current.rNext;
			}

			r = current.rNext;
			newNode.rNext = r;
			r.lNext = newNode;
			current.rNext = newNode;
			newNode.lNext = current;
		}

	}

	public void removeH() {

		if (isEmpty()) {
			System.out.println("No node to remove");
		} else {
			DoubleNode current = first;
			first = current.rNext;
			current.rNext = last.rNext;
		}
	}

	public void removeT() {

		if (isEmpty()) {
			System.out.println("No node to remove");
		} else {
			DoubleNode current = first;
			DoubleNode prev = first;
			while (current != last) {
				prev = current;
				current = current.rNext;
			}
			if (first != last) {
				prev.rNext = last.rNext;
				last.lNext = first.lNext;
				last = prev;
			} else {
				first = current.lNext;
				last = current.rNext;
			}

		}
	}

	public void removeM(int target) {

		if (isEmpty()) {
			System.out.println("No node to remove");
		} else {
			DoubleNode current = first;
			DoubleNode prev = first;
			DoubleNode r = first;
			while (current != null && current.data != target) {
				prev = current;
				current = current.rNext;
			}
			if (current == null) {
				System.out.println("It can't find the target value:" + target);
			} else if (current != first && current != last) {
				r = current.rNext;
				r.lNext = current.lNext;
				prev.rNext = current.rNext;
				current.rNext = last.rNext;
				current.lNext = first.lNext;
			} else {
				System.out.println("The target value " + target
						+ " is not in the middle");
			}

		}
	}

}

class DoubleNode {

	public int data;

	public DoubleNode lNext;

	public DoubleNode rNext;

	public DoubleNode(int data) {
		this.data = data;
		this.lNext = null;
		this.rNext = null;
	}
}
