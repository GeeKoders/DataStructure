package Practice.Collection;

import java.util.PriorityQueue;
import java.util.Queue;

import Collections.Person;

public class MyPriorityQueue {

	public static void main(String []args){
		
		Queue<Person> queue = new PriorityQueue<Person>() ;
		
		queue.add(new Person("James", 36));
		queue.add(new Person("Alice", 25));
		queue.add(new Person("Tom", 23));
		queue.add(new Person("Wang", 41));
		
		while(queue.peek()!=null){
			System.out.println(queue.poll());
		}
		
	}
}
