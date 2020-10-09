package Practice.Tree.AVL;

public class AvlTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root ;
	
	@Override
	public void insert(T data) {
		
		if(root == null){
			root = new Node<T>(data) ;
		}else{
			insert(root, data) ;
		}
		
	}
	
	public Node<T> insert(Node<T> curr, T data){
		
		if(data.compareTo(curr.getData()) < 0){
			
			if(curr.getLeftChild() == null){
				Node<T> newNode = new Node<T>(data) ;
				curr.setLeftChild(newNode);
			}else{
				insert(curr.getLeftChild(), data) ; 
			}
			
		}else{
			
			if(curr.getRightChild() == null){
				Node<T> newNode = new Node<T>(data) ;
				curr.setRightChild(newNode);
			}else{
				insert(curr.getRightChild(), data) ;
			}
		}
		
		curr.setHeight(Math.max(height(curr.getLeftChild()), height(curr.getRightChild())) + 1);
		curr = settleViolation(curr, data) ;
		return curr ;
		
	}

	private Node<T> settleViolation(Node<T> curr, T data) {
		
		int balance = getBalance(curr) ;
		
		//left-left rotation
		if(balance > 1 && data.compareTo((T) curr.getLeftChild().getData()) < 0){
			return rightRotation(curr) ;
		}
		
		//right-right rotation
		if(balance < -1 && data.compareTo((T)curr.getRightChild().getData()) > 0){
			return leftRotation(curr) ;
		}
		
		//left-right rotation
		if(balance > 1 && data.compareTo((T)curr.getLeftChild().getData()) > 0){
			curr.setLeftChild(leftRotation(curr.getLeftChild()));
			return rightRotation(curr) ;
		}
		
		//right-left rotation
		if(balance < -1 && data.compareTo((T)curr.getRightChild().getData()) < 0){
			curr.setRightChild(rightRotation(curr.getRightChild()));
			return leftRotation(curr) ;
		}

		return curr;
		
	}

	@Override
	public void traverse() {
		if(root == null) return ;
		inOrderTraversal(root) ;
	}
	
	public void inOrderTraversal(Node<T> root){
		
		if(root.getLeftChild()!=null){
			inOrderTraversal(root.getLeftChild()) ;
		}
		
		System.out.println(root);
		
		if(root.getRightChild()!=null){
			inOrderTraversal(root.getRightChild()) ;
		}
	}
	
	public int height(Node<T> curr){
		if(curr == null) return -1 ;
		return curr.getHeight() ;
	}
	
	public int getBalance(Node<T> curr){
		if(curr == null) return 0 ;
		return height(curr.getLeftChild()) - height(curr.getRightChild()) ;
	}

	@Override
	public void delete(T data) {
		
	}
	
	public Node<T> rightRotation(Node<T> curr){
		
		System.out.println("Rotating to the right on node: " + curr);
		
		Node<T> tempLeftNode = curr.getLeftChild() ;
		Node<T> t = tempLeftNode.getRightChild() ;
		
		tempLeftNode.setRightChild(curr);
		curr.setLeftChild(t);
		
		tempLeftNode.setHeight(Math.max(height(curr.getLeftChild()), height(curr.getRightChild())) + 1);
		curr.setHeight(Math.max(height(curr.getLeftChild()), height(curr.getRightChild())) + 1) ;
		
		return tempLeftNode ;
		
	}
	
	public Node<T> leftRotation(Node<T> curr){
		
		System.out.println("Rotating to the left on node: " + curr);
		
		Node<T> tempRightNode = curr.getRightChild() ;
		Node<T> t = tempRightNode.getLeftChild() ;
		
		tempRightNode.setLeftChild(curr) ;
		curr.setRightChild(t);
		
		tempRightNode.setHeight(Math.max(height(curr.getLeftChild()), height(curr.getRightChild())) + 1);
		curr.setHeight(Math.max(height(curr.getLeftChild()), height(curr.getRightChild())) + 1) ;
		
		return tempRightNode ;
	}

}
