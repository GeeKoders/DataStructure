package Practice.Tree.SplayTree;

import SplayTree.SplayTree;
import SplayTree.Tree;

public class App {

	public static void main(String[] args) {
		Tree<Integer> splayTree = new SplayTree<>() ;
		
		splayTree.insert(10);
		splayTree.insert(-5);
		splayTree.insert(0);
		splayTree.insert(20);
		splayTree.insert(30);
		
//		System.out.println(splayTree.getMax());
//		splayTree.inOrderTraversal();
		splayTree.find(20) ;
		
		((SplayTree) splayTree).printRoot() ;
		
	}

}
