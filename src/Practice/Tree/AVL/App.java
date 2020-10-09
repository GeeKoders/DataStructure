package Practice.Tree.AVL;

public class App {

	public static void main(String[] args) {

		Tree<Integer> tree = new AvlTree<>() ;
		
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(60);
		
		tree.traverse();
		
	}

}
