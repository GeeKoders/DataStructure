package Practice.Tree;

public class Tree {
	
	private static Node root ;
	
	public static void main(String[] args) {
		
		Tree bst = new Tree() ;
		bst.insert(32);
		bst.insert(10);
		bst.insert(55);
		bst.insert(1);
		bst.insert(19);
		bst.insert(79);
		bst.insert(16);
		bst.insert(23);
		
//		bst.inOderTraversal(root); 
//		System.out.println(bst.getMax(root));
//		System.out.println(bst.getMin(root));
//		System.out.println(bst.getRoot().data);
		System.out.println(bst.getPredecessor(root.left));
		System.out.println(bst.getSuccessor(root.right));
	}
	
	public Node getRoot(){
		return root ;
	}
	//largest item in the left subtree
	public Integer getPredecessor(Node root){
		
		if(root == null) return null ;
		
		Node curr = root ;
		if(curr.right != null){
			return getPredecessor(curr.right) ;
		}
		
		return curr.data ;
		
	}
	
	public Integer getSuccessor(Node root){
		
		if(root == null) return null ;
		Node curr = root ;
		
		if(curr.left !=null){
			return getSuccessor(curr.left) ;
		}
		
		return curr.data ;
		
	}
	
	public void insert(int data){
		
		if(root == null){
			root = new Node(data); 
		}else{
			insertNode(root, data) ;
		}
		
		
	}
	
	private void insertNode(Node root, int data) {

		Node curr = root ;
			
		if(data < curr.data){
			
			if(curr.left != null){
				insertNode(curr.left, data) ;
			}else{
				Node newNode = new Node(data) ;
				curr.left = newNode ;
			}
		}else{
			if(curr.right != null){
				insertNode(curr.right, data) ;
			}else{
				Node newNode = new Node(data) ;
				curr.right = newNode ;
			}
		}
		
	}
	
	public Integer getMax(Node root){
		
		if(root == null) return null ;
		Node curr = root ;
		while(curr.right!=null){
			curr = curr.right ;
		}
		return curr.data ;
	}
	
	public Integer getMin(Node root){
		if(root == null) return null ;
		Node curr = root ;
		while(curr.left!=null){
			curr = curr.left ;
		}
		
		return curr.data ;
		
	}

	public void inOderTraversal(Node root){
		if(root == null) return ;
		inOrder(root) ;
	}

	private void inOrder(Node root) {
		if(root != null){
			inOrder(root.left) ;
			System.out.println(root.data);
			inOrder(root.right) ;
		}
	}
	
	public void preOderTraversal(Node root){
		if(root == null) return ;
		preOrder(root) ;
	}

	private void preOrder(Node root) {
		if(root != null){
			System.out.println(root.data);
			preOrder(root.left) ;
			preOrder(root.right) ;
		}
	}
	
	public void postOderTraversal(Node root){
		if(root == null) return ;
		postOrder(root) ;
	}

	private void postOrder(Node root) {
		if(root != null){
			postOrder(root.left) ;
			postOrder(root.right) ;
			System.out.println(root.data);
		}
	}
	
}


class Node{
	
	int data ;
	Node left ;
	Node right ;
	Node next ;
	
	public Node(int data) {
		this.data = data ;
		this.next = null ;
	}
	
	
}
