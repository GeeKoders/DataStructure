package Practice.Tree.binarySearchTree;


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
//		System.out.println((bst.getPredecessor(root.left)).data);
//		System.out.println(bst.getSuccessor(root.right));
		System.out.println(bst.delete(root, 32));
		bst.inOderTraversal(root); 
	}
	
	public Node getRoot(){
		return root ;
	}
	//largest item in the left subtree
	public Node getPredecessor(Node root){
		
		if(root == null) return null ;
		
		Node curr = root ;
		if(curr.right != null){
			return getPredecessor(curr.right) ;
		}
		
		return curr ;
		
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
	
	public void delete(int data){
		
		if(root != null){
			root = delete(root, data) ;
		}
		
	}

	private Node delete(Node root, int data) {
		
		if(root == null) return null ;
		
		Node curr = root ;
		
		if(data < curr.data){
			curr.left = delete(curr.left, data) ;
		}else if(data > curr.data){
			curr.right = delete(curr.right, data) ;
		}else{
			
			if(curr.left == null && curr.right == null){
				System.out.println("Removing a leaf node...");
				return null ;
			}
			//update the reference
			if(curr.left == null){
				System.out.println("Removing the right child...");
				Node temp = curr.right ;
				curr = null ;
				return temp ;
			}else if(curr.right == null){
				System.out.println("Removing the left child...");
				Node temp = curr.left ;
				curr = null ;
				return temp ;
			}
			
			//this is the node with two children case !!!
			System.out.println("Removing item with two children...");
			Node temp = getPredecessor(curr.left);
			curr.data = temp.data ;
			curr.left = delete(curr.left, temp.data) ;
			
		}
		return curr;
	}
	
}


class Node{
	
	int data ;
	Node left ;
	Node right ;
	
	public Node(int data) {
		this.data = data ;
	}
	
}
