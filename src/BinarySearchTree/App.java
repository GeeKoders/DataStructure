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
		
		// =====================================================
		// O(N) or O(logN)
//		Tree<Person> bst = new BinarySearchTree<Person>() ;
//		
//		bst.insert(new Person("Adam", 27));
//		bst.insert(new Person("Kevin", 13));
//		bst.insert(new Person("Joe", 67));
//		bst.insert(new Person("Michael", 2));
//		bst.insert(new Person("Smith", 11));
//		
//		bst.traversal();
		
		//======================================================
		
		Tree<Integer> bst1 = new BinarySearchTree<Integer>() ;
		
		bst1.insert(2);
		bst1.insert(55);
		bst1.insert(67);
		bst1.insert(12);
		bst1.insert(11);
		
		Tree<Integer> bst2 = new BinarySearchTree<Integer>() ;
		
		bst2.insert(2);
		bst2.insert(50);
		bst2.insert(67);
		bst2.insert(12);
		bst2.insert(11);
		
		TreeCompareHelper<Integer> helper = new TreeCompareHelper<Integer>() ;
		
		System.out.println(helper.compareTrees(bst1.getRoot(), bst2.getRoot())) ;
	}
	
}
