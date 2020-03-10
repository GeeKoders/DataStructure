package BinarySearchTree;

public class App {
	
	public static void main(String[] args) {
		
//		Tree<Integer> bst = new BinarySearchTree<>() ;
//		
//		bst.insert(10) ;
//		bst.insert(5) ;
//		bst.insert(15) ;
//		bst.insert(3) ;
//		
//		bst.delete(5);
//		bst.traversal();
		// O(N) or O(logN)
		Tree<Person> bst = new BinarySearchTree<Person>() ;
		
		bst.insert(new Person("Adam", 27));
		bst.insert(new Person("Kevin", 13));
		bst.insert(new Person("Joe", 67));
		bst.insert(new Person("Michael", 2));
		bst.insert(new Person("Smith", 11));
		
		bst.traversal();
		
	}
	
}
