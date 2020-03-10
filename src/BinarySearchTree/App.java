package BinarySearchTree;

public class App {
	
	public static void main(String[] args) {
		
		Tree<Integer> bst = new BinarySearchTree<>() ;
		
		bst.insert(10) ;
		bst.insert(5) ;
		bst.insert(15) ;
		bst.insert(3) ;
		
		bst.delete(5);
		bst.traversal();
		
	}
	
}
