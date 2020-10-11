package Practice.Tree.RedBlackTree;

public class RedBlackTree implements Tree {

	private Node root ;
	
	
	@Override
	public void traverse() {

		if(root == null) return ;
		traverseInOrder(root); 
		
		
	}

	private void traverseInOrder(Node curr) {
		
		if(curr.getLeftChild()!=null){
			traverseInOrder(curr.getLeftChild()) ;
		}
		
		System.out.println(curr + " with color: " + curr.getColor() + " Left node: " + curr.getLeftChild() + " Right node: " + curr.getRightChild() );
		
		if(curr.getRightChild()!=null){
			traverseInOrder(curr.getRightChild()) ;
		}
	
		
	}

	@Override
	public void insert(int data) {

		
		if(root == null){
			root = new Node(data) ;
		}else{
			root = insertIntoTree(root, data) ; 
		}
		
	}

	private Node insertIntoTree(Node curr, int data) {
	
		if(data < curr.getData()){
			curr.setLeftChild(insertIntoTree(curr.getLeftChild(), data));
			curr.getLeftChild().setParent(curr);
		}else if(data > curr.getData()){
			curr.setRightChild(insertIntoTree(curr.getRightChild(), data));
			curr.getRightChild().setParent(curr);
		}
		
		return curr ;
	
	}

}
