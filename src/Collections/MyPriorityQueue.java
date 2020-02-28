package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyPriorityQueue {

	
	/**
	 * Base on a priority heap !!!
	 * 	 we assign a priority value to every single items
	 * 
	 * 		- element with high priority is served before an elements with low priority
	 * 
	 * 		- the elements of the priority queue are ordered according to their natural ordering 
	 * 			defined by the Comparable interface
	 * 
	 * add() -> add elements to the queue
	 * 
	 * peek() -> Retrieves, but does not remove, the head of this queue,
	 * 				or returns null if this queue is empty.
	 * 
	 * poll() -> Retrieves and removes the head of this queue, or returns null if this queue is empty
	 * 
	 */
	
	public static void main(String[] args) {

		Queue queue = new PriorityQueue();

		queue.add(new Person("James", 36));
		queue.add(new Person("Alice", 25));
		queue.add(new Person("Tom", 23));
		queue.add(new Person("Wang", 41));

		while (queue.peek() != null) {
			System.out.println(queue.poll());
		}

	}

}
