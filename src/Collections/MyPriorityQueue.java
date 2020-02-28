package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyPriorityQueue {

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
