package SplayTree;

public class SplayTree<T extends Comparable<T>> implements Tree<T> {

	private int size;

	private Node<T> rootNode;

	@Override
	public void insert(T data) {

		Node<T> tempNode = this.rootNode;
		Node<T> parentNode = null;

		while (tempNode != null) {

			parentNode = tempNode;

			if (tempNode.getData().compareTo(data) < 0) {
				tempNode = tempNode.getRightNode();
			} else {
				tempNode = tempNode.getLeftNode();
			}

		}

		tempNode = new Node<T>(data);
		tempNode.setParentNode(parentNode);

		if (parentNode == null) {
			this.rootNode = tempNode;
		} else if (parentNode.getData().compareTo(tempNode.getData()) < 0) {
			parentNode.setRightNode(tempNode);
		} else {
			parentNode.setLeftNode(tempNode);
		}

		splay(tempNode);

		this.size++;

	}

	private void splay(Node<T> tempNode) {

	}

	@Override
	public Node find(T data) {

		Node<T> tempNode = this.rootNode ;
		
		while(tempNode != null){
			
			if(tempNode.getData().compareTo(data)<0){
				tempNode = tempNode.getRightNode() ;
			}else if(tempNode.getData().compareTo(data)>0){
				tempNode = tempNode.getLeftNode() ;
			}else{
				splay(tempNode) ;
				return tempNode ;
			}
		}
		
		splay(tempNode) ;
		return null;
	}

	@Override
	public T getMin() {
		
		if(!isEmpty()){
			return getMin(rootNode) ;
		}
		
		return null;
	}

	private T getMin(Node<T> node) {
		
		if(node.getLeftNode()!=null){
			return getMin(node.getLeftNode()) ;
		}else{
			return node.getData() ;
		}
	}

	@Override
	public T getMax() {
		
		if(!isEmpty()){
			return getMax(rootNode) ;
		}
		
		return null;
	}

	private T getMax(Node<T> node) {
		
		if(node.getRightNode()!=null){
			return getMax(node.getRightNode()) ;
		}else{
			return node.getData() ;
		}
	}
	
	public void printRoot(){
		System.out.println(rootNode);
	}
	
	public boolean isEmpty(){
		return this.rootNode == null ;
	}
	
	public int size(){
		return this.size ;
	}
	
	@Override
	public void inOrderTraversal() {

		if (this.rootNode != null) {
			inOrderTraversal(rootNode);
		}

	}

	private void inOrderTraversal(Node<T> node) {

		if (node.getLeftNode() != null) {
			inOrderTraversal(node.getLeftNode());
		}

		System.out.println(node + " ");

		if (node.getRightNode() != null) {
			inOrderTraversal(node.getRightNode());
		}

	}

}
