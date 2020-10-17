package Practice.Tree.SplayTree;

public class SplayTree <T extends Comparable<T>> implements Tree<T> {

	private int size ;
	
	private Node<T> root ;
	
	
	@Override
	public void insert(T data) {

		Node<T> tempNode = this.root ;
		Node<T> parentNode = null ;
		
		while(tempNode != null){
			
			parentNode = tempNode ;
			
			if(tempNode.getData().compareTo(root.getData()) < 0){
				tempNode = tempNode.getLeftNode() ;
			}else{
				tempNode = tempNode.getRightNode() ;
			}
		}
		
		tempNode = new Node(data) ;
		tempNode.setParentNode(parentNode);
		
		if(parentNode == null){
			this.root = tempNode ;
		}else if(parentNode.getData().compareTo(tempNode.getData()) < 0){
			parentNode.setRightNode(tempNode);
		}else{
			parentNode.setLeftNode(tempNode);
		}
		
		splay(tempNode) ;
		this.size ++ ;
		
	}

	private void splay(Node<T> tempNode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Node find(T data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getMin() {
		
		if(this.root != null){
			return getMin(root) ;
		}
		
		return null;
	}

	private T getMin(Node<T> curr) {
		if(curr.getLeftNode()!=null){
			return getMin(curr.getLeftNode()) ;
		}
		
		return curr.getData();
	}

	@Override
	public T getMax() {

		if(this.root != null){
			return getMax(root) ;
		}
		
		return null;
	}

	private T getMax(Node<T> curr) {

		if(curr.getRightNode()!=null){
			return getMax(curr.getRightNode()) ;
		}
		
		return curr.getData();
	}

	@Override
	public void inOrderTraversal() {

		if(this.root != null){
			inOrderTraversal(root) ;
		}
		
	}

	private void inOrderTraversal(Node<T> curr) {


		if(curr.getLeftNode() != null){
			inOrderTraversal(curr.getLeftNode()) ;
		}
		
		System.out.println(curr + " ");
		
		if(curr.getRightNode() != null){
			inOrderTraversal(curr.getRightNode()) ;
		}
	}

}
