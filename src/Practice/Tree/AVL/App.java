package Practice.Tree.AVL;

public class App {

	public static void main(String[] args) {

		Tree<Integer> tree = new AvlTree<>() ;
		
//		tree.insert(10);
//		tree.insert(20);
//		tree.insert(30);
//		tree.insert(40);
//		tree.insert(50);
//		tree.insert(60);
//		
//		tree.traverse();
		
		tree.insert(10);
		tree.insert(15);
		tree.insert(5);
		tree.insert(6);
		
		tree.delete(15) ;
		
		tree.traverse();
		
		
	}

}
