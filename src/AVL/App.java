package AVL;

public class App {
	
	public static void main(String[] args){
		
		
		Tree <Integer> avl = new AvlTree<Integer>() ;
		
		avl.insert(10);
		avl.insert(20);
		avl.insert(30);
		avl.insert(40);
		avl.insert(50);
		avl.insert(60);
		
		avl.traverse();
		
//		========================================================
		
//		Tree avl = new AvlTree() ;
//		
//		avl.insert(10);
//		avl.insert(15);
//		avl.insert(5);
//		avl.insert(6);
//		
//		avl.delete(15) ;
//		
//		avl.traverse();
//		
		
		
	}

}
