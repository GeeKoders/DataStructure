package BinarySearchTree;

public class App {
	
	public static void main(String[] args) {
		
		Tree<String> bst = new BinarySearchTree<>() ;
		
		bst.insert("Adam") ;
		bst.insert("Joe") ;
		bst.insert("Michael") ;
		bst.insert("Kevin") ;
		bst.insert("Staff") ;
		bst.insert("Daniel") ;
		
		bst.traversal();
		
	}
	
}
