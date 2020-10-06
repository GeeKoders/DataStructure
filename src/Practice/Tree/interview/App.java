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
		
		//getAgeSum() 
		//post order traversal
		Tree<Person> tree = new BinarySearchTree<Person>() ;
		tree.insert(new Person("Adam", 47));
		tree.insert(new Person("Kevin", 21));
		tree.insert(new Person("Joe", 55));
		tree.insert(new Person("Arnold", 20));
		tree.insert(new Person("Noel", 34));
		tree.insert(new Person("Marko", 68));
		tree.insert(new Person("Susan", 23));
		tree.insert(new Person("Rose", 38));
		System.out.println(tree.getAgeSum());
		
		
		
	}

}
