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
		
		System.out.println(curr + " with color: " + curr.getColor() + " Left node: " +¡@curr.getLeftChild() + " Right node: " + curr.getRightChild() );
		
		if(curr.getRightChild()!=null){
			traverseInOrder(curr.getRightChild()) ;
		}
	
		
	}

	@Override
	public void insert(int data) {
		// TODO Auto-generated method stub
		
	}

}
