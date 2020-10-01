package Practice.Tree;

public class BinarySearchTree<T extends Comparable<T>> {

	private PersonNode<T> root ;
	
	public void insert(T data){
		
		if(root == null){
			root = new PersonNode<T>(data) ; 
		}else{
			insert(root, data) ;
		}
		
		
	}
	
	private void insert(PersonNode<T> curr, T data) {
		
		if(data.compareTo(curr.data) < 0){
			
			if(curr.left == null){
				PersonNode<T> newNode = new PersonNode<T>(data) ;
				curr.left = newNode ;
			}else{
				insert(curr.left, data) ;
			}
		}else{
			if(curr.right == null){
				PersonNode<T> newNode = new PersonNode<T>(data) ;
				curr.right = newNode ;
			}else{
				insert(curr.right, data) ;
			}
		}
		
	}
	
	public void traverse(){
		if(root == null) return ;
		traversal(root) ;
	}

	public void traversal(PersonNode <T>root){
			
		if(root.left != null){
			traversal(root.left) ;
		}
		System.out.println(root + " --> ");
		if(root.right != null){
			traversal(root.right) ;
		}
		
	}
}
