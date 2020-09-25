package Practice.Tree;

public class Tree<T> {
	
	private Node<T> root ;
	
	public static void main(String[] args) {
		
	}
	
	public void inOderTraversal(Node<T> root){
		if(root == null) return ;
		inOrder(root) ;
	}

	private void inOrder(Node<T> root) {
		if(root != null){
			inOrder(root.left) ;
			System.out.println(root.data);
			inOrder(root.right) ;
		}
	}
	
	public void preOderTraversal(Node<T> root){
		if(root == null) return ;
		preOrder(root) ;
	}

	private void preOrder(Node<T> root) {
		if(root != null){
			System.out.println(root.data);
			preOrder(root.left) ;
			preOrder(root.right) ;
		}
	}
	
	public void postOderTraversal(Node<T> root){
		if(root == null) return ;
		postOrder(root) ;
	}

	private void postOrder(Node<T> root) {
		if(root != null){
			postOrder(root.left) ;
			postOrder(root.right) ;
			System.out.println(root.data);
		}
	}
	
}


class Node<T>{
	
	T data ;
	Node<T> left ;
	Node<T> right ;
	Node<T> next ;
	
	public Node(T data) {
		this.data = data ;
		this.next = null ;
	}
	
	
}
