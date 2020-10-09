package Practice.Tree.binarySearchTree;

public class App {

	public static void main(String[] args) {

		BinarySearchTree<Person> bst = new BinarySearchTree<Person>() ;
		
		bst.insert(new Person("Adam", 35));
		bst.insert(new Person("Alice", 34));
		bst.insert(new Person("Wali", 29));
		
		bst.traverse();
		
	}

}
