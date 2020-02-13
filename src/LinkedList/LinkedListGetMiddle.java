package LinkedList;

public class LinkedListGetMiddle<T> {

	private MiddleNode<T> first;

	private MiddleNode<T> last;

	private int count = 0;

	public static void main(String[] args) {

		LinkedListGetMiddle<Integer> linkedListGetMiddle = new LinkedListGetMiddle<Integer>();

		linkedListGetMiddle.insertT(1);
		linkedListGetMiddle.insertT(2);
		linkedListGetMiddle.insertT(3);
		linkedListGetMiddle.insertT(4);

		linkedListGetMiddle.print();
		System.out.println();
		int size = linkedListGetMiddle.size();
		System.out.println("size:" + size);
		// linkedListGetMiddle.getMiddle1(size);
		linkedListGetMiddle.getMiddle2();

	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {

		MiddleNode<T> current = first;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public void print() {

		MiddleNode<T> current = first;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	public void insertT(T data) {

		MiddleNode<T> newMiddleNode = new MiddleNode<T>(data);

		if (isEmpty()) {
			first = newMiddleNode;
			last = newMiddleNode;
		} else {
			last.next = newMiddleNode;
			last = newMiddleNode;
		}
	}

	// O(N)
	public void getMiddle1(int size) {

		if (isEmpty()) {
			System.out.println("There is no node");
		} else {
			if (size % 2 == 0) {
				System.out.println("There is no middle node");
			} else {
				int i = 1;
				MiddleNode<T> current = first;

				while (i != (size + 1) / 2) {
					current = current.next;
					i++;
				}
				System.out.println("The middle node is:" + current.data);
			}
		}
	}

	public void getMiddle2() {

		MiddleNode<T> fasterPointer = first;
		MiddleNode<T> slowerPointer = first;

		if (isEmpty()) {
			System.out.println("There is no node");
		} else {
			while (fasterPointer != null && fasterPointer.next != null
					&& fasterPointer.next.next != null) {
				fasterPointer = fasterPointer.next.next;
				slowerPointer = slowerPointer.next;
			}

			System.out.println("The middle node is:" + slowerPointer.data);
		}
	}

}

class MiddleNode<T> {

	public T data;

	public MiddleNode<T> next;

	public MiddleNode(T data) {
		this.data = data;
		this.next = null;
	}

}