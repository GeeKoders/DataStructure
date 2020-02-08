package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Test {

	private TestNode first;

	private TestNode last;

	private int count = 0;

	public static void main(String[] args) {
		Test test = new Test();
		// insert node starts

		// test.insertH(1) ;
		// test.insertH(2) ;
		// test.insertH(3) ;
		// test.insertH(4) ;
		// test.insertH(5) ;
		//
		// test.print() ; // 5 4 3 2 1

		// test.insertT(1) ;
		// test.insertT(2) ;
		// test.insertT(3) ;
		// test.insertT(4) ;
		// test.insertT(5) ;
		// test.print() ; // 1 2 3 4 5
		// System.out.println("==================================") ;
		//
		// test.insertM(6, 3) ;
		// test.print() ; // 1 2 3 6 4 5

		// test.insertComplete("T", 1, -1);
		// test.insertComplete("T", 2, -1);
		// test.insertComplete("T", 3, -1);
		// test.insertComplete("T", 4, -1);
		// test.insertComplete("T", 5, -1);
		// test.insertComplete("M", 6, 3);
		// test.print();
		//
		// System.out.print("size:" + test.size()) ;

		// System.out.println("==================================") ;

		// remove node starts

		test.insertT(1);
		test.insertT(2);
		test.insertT(3);
		test.insertT(4);
		test.insertT(5);
		test.print();
		System.out.println("==================================");
		// test.removeH() ;
		// test.removeT();
		// test.print();
		test.removeM(3);
		test.print();

	}

	// O(1)
	public void insertH(int data) {

		TestNode newNode = new TestNode(data);

		if (isEmpty()) {
			first = newNode;
			last = newNode;
		} else {
			newNode.next = first;
			first = newNode;
		}

	}

	// O(N)
	public void insertT(int data) {

		TestNode newNode = new TestNode(data);

		if (isEmpty()) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}

	}

	// O(N)
	public void insertM(int data, int afterData) {

		TestNode newNode = new TestNode(data);
		TestNode current = first;
		boolean searchFlag = false;

		if (isEmpty()) {
			first = newNode;
			last = newNode;
		} else {
			while (current.next != null && current.data != afterData) {
				current = current.next;
				if (current.data == afterData) {
					searchFlag = true;
					newNode.next = current.next;
					current.next = newNode;
				}

			}
		}

		if (!searchFlag)
			System.out.println("It can't find target value:" + afterData);

	}

	public void insertComplete(String type, int data, int target) {

		TestNode newNode = new TestNode(data);

		if (isEmpty()) {
			first = newNode;
			last = newNode;
		} else {
			if (target == -1) {
				if (StringUtils.equals("H", type)) { // Head
					newNode.next = first;
					first = newNode;
				} else if (StringUtils.equals("T", type)) { // Tail
					last.next = newNode;
					last = newNode;
				}
			} else { // Middle

				TestNode current = first;
				while (current.next != null && current.data != target) {

					current = current.next;
					if (current.data == target) {
						newNode.next = current.next;
						current.next = newNode;
					}
				}
			}
		}
	}

	// O(1)
	public void removeH() {

		TestNode current = first;

		if (isEmpty()) {
			System.out.println("No nodes to remove");
		} else {
			first = first.next;
		}

	}

	// O(N)
	public void removeT() {

		if (isEmpty()) {
			System.out.println("No nodes to remove.");
		} else {

			if (first == last) {
				first = null;
				last = null;
			} else {

				TestNode current = first;
				TestNode previous = first;

				while (current != null) {

					previous = current;
					current = current.next;

					if (current == last) {
						previous.next = current.next;
						current = last.next;
						last = previous;
					}
				}
			}

		}

	}

	public void removeM(int target) {

		if (isEmpty()) {
			System.out.println("No nodes to remove");
		} else {

			TestNode current = first;
			TestNode previous = first;
			
			boolean searchFlag = false ;

			while (current!=null && current.data != target) {
				searchFlag = true ;
				previous = current;
				current = current.next;
				
			}
			
			if(current == null){
				System.out.println("It can't find target value:" + target);
			}else{
				if(current == first || current == last){
					searchFlag = true ;
					System.out.println("Remove the target value that it should be in the middle");
				}else{
					previous.next = current.next;
				}
				
				if (!searchFlag) System.out.println("It can't find target value:" + target);
			}
			
			
			
			
		}
	}

	public void print() {

		TestNode current = first;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {

		TestNode current = first;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;

	}

}

class TestNode {

	public int data;

	public TestNode next;

	public TestNode(int data) {
		this.data = data;
		this.next = null;
	}
}
