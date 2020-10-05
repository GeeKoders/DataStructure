package Practice.Tree.interview;

public class App {

	public static void main(String[] args) {

		Tree<Integer> bst = new BinarySearchTree<Integer>() ;
		
		bst.insert(2) ;
		bst.insert(55);
		bst.insert(67);
		bst.insert(12);
		bst.insert(11);

		System.out.println(bst.treeSize(bst.getRoot()));
		
		System.out.println(bst.getKSmallest(bst.getRoot(), 5)) ;
	}

}
