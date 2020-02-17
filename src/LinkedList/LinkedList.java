package LinkedList ;

public class LinkedList <T> {

	private Node <T> first ;
	private Node <T> last ;
	
	
	public static void main(String[] args) {
		LinkedList <Person>linkedList = new LinkedList<>() ;
		
		linkedList.insertT(new Person("Paul", "M", 37));
		linkedList.insertT(new Person("Alice", "F", 35));
		
//		System.out.println("=========LinkedList insert tail start===========") ;
//		System.out.println(linkedList.isEmpty()) ;
//		linkedList.insertT(5);
//		linkedList.insertT(2);
//		linkedList.insertT(3);
//		linkedList.insertT(4);
//		linkedList.insertT(1);
//		System.out.println(linkedList.isEmpty()) ;
//		linkedList.print();
//		System.out.println("=========LinkedList insert head start===========") ;
//		
//		linkedList.insertH(6);
//		linkedList.insertH(8);
//		linkedList.insertH(9);
//		linkedList.print();
//		System.out.println("=========LinkedList remove head start===========") ;
//		linkedList.removeH();
//		linkedList.removeH();
//		linkedList.removeH();

		linkedList.print();
		
		
		
	}
	
	public void print(){
		
		Node <T> newNode = first ;
		
		while(newNode!=null){
			System.out.println(newNode.data);
			newNode = newNode.next ;
		}
	}
	
	//O(1)
	public void insertH(T data){
		
		Node <T> newNode = new Node<>(data) ;
		
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
		
		Node <T> newNode = new Node<>(data) ;
		
		if(isEmpty()){
			first = newNode ;
			last = newNode ;
		}else{
			last.next = newNode ;
			last = newNode ;
		}
	}
	
	//O(1)
	public void removeH(){
		
		if(isEmpty()){
			System.out.println("No nodes to remove.") ;
		}else{
			first = first.next ;
		}
		
	}
	
	
	
	public boolean isEmpty(){
		return first == null ;
	}

}

class Node<T>{
	
	public T data ;
	public Node<T> next;
	
	public Node(T data) {
		this.data = data ;
		this.next = null;
	}
}

class Person implements Comparable<Person>{

	private String name ;
	
	private String sex ; 
	
	private int age ;
	
	public Person(String name, String sex, int age){
		
		this.name = name ;
		this.sex = sex ;
		this.age = age ;
	}
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getSex() {
		return sex;
	}




	public void setSex(String sex) {
		this.sex = sex;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString(){
		return this.name.toString() ;
	}


	@Override
	public int compareTo(Person person) {
		return Integer.compare(this.age, person.age) ;
	}
	
}
