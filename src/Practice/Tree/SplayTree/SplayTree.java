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
	
	private void rotateLeft(Node<T> curr){
		
		System.out.println("Rotate left on node " + curr);
		Node tempRightNode = curr.getRightNode();
		curr.setRightNode(tempRightNode.getLeftNode());
		
		if( curr.getRightNode() != null )
			curr.getRightNode().setParentNode(curr);
		
		tempRightNode.setParentNode(curr.getParentNode());
		
		if( tempRightNode.getParentNode() == null )
			this.root = tempRightNode;
		else if( curr == curr.getParentNode().getLeftNode() )
			curr.getParentNode().setLeftNode(tempRightNode);
		else
			curr.getParentNode().setRightNode(tempRightNode);
		
		tempRightNode.setLeftNode(curr);
		curr.setParentNode(tempRightNode);
	}
	
	private void rotateRight(Node<T> curr){
		
		System.out.println("Rotate right on node " + curr);
		Node tempLeftNode = curr.getLeftNode();
		curr.setLeftNode(tempLeftNode.getRightNode());
		
		if( curr.getLeftNode() != null )
			curr.getLeftNode().setParentNode(curr);
		
		tempLeftNode.setParentNode(curr.getParentNode());
		
		if( tempLeftNode.getParentNode() == null )
			root = tempLeftNode;
		else if( curr == curr.getParentNode().getLeftNode() )
			curr.getParentNode().setLeftNode(tempLeftNode);
		else
			curr.getParentNode().setRightNode(tempLeftNode);
		
		tempLeftNode.setRightNode(curr);
		curr.setParentNode(tempLeftNode);
		
	}

	private void splay(Node<T> tempNode) {

		
		
	}

	@Override
	public Node find(T data) {

		Node<T> curr = this.root ;
		
		if(curr!=null){
			
			if(curr.getData().compareTo(data) < 0){
				root = find(curr.getRightNode().getData()) ;
			}else if(curr.getData().compareTo(data) > 0){
				root = find(curr.getLeftNode().getData()) ;
			}else{
				splay(curr) ;
				return curr ;
			}
			
		}
		splay(curr) ;
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
	
	public int size(){
		return this.size ;
	}
	
	public boolean isEmpty(){
		return this.root == null ;
	}
	
	public void printRoot(){
		System.out.println(root);
	}

}
