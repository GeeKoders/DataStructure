package Practice.Tree.RedBlackTree;

import RedBlackTree.NodeColor;

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
		
		fixVioloations(root) ;
		
	}

	private void fixVioloations(Node curr) {

		Node parentNode = null ;
		Node grandParentNode = null ;
		
		while( curr != root && curr.getColor() != NodeColor.BLACK && curr.getParent().getColor() == NodeColor.RED ) {
			
			parentNode = curr.getParent() ;
			grandParentNode = curr.getParent().getParent() ;
			
			if(parentNode == grandParentNode.getLeftChild()){
				
				Node uncle = grandParentNode.getRightChild() ;
				//case I && case VI
				if(uncle != null && uncle.getColor() == NodeColor.RED){
					grandParentNode.setColor(NodeColor.RED);
					parentNode.setColor(NodeColor.BLACK);
					uncle.setColor(NodeColor.BLACK);
					curr = grandParentNode ;
				}else{
					
					if(curr == parentNode.getRightChild()){
						leftRotate(parentNode) ;
						//update the reference
						curr = parentNode ;
						parentNode = curr.getParent() ;
					}
					//case III
					rightRotate(grandParentNode) ;
					NodeColor tempColor = parentNode.getColor() ;
					parentNode.setColor(grandParentNode.getColor());
					grandParentNode.setColor(tempColor);
					curr = parentNode ;
					
					
					
				}
				
				
			}else{
				
				Node uncle = grandParentNode.getLeftChild() ;
				
				if(uncle != null && uncle.getColor() == NodeColor.RED){
					grandParentNode.setColor(NodeColor.RED);
					parentNode.setColor(NodeColor.BLACK);
					uncle.setColor(NodeColor.BLACK);
					curr = grandParentNode ;
				}else{
					//case II
					if(curr == parentNode.getLeftChild()){
						rightRotate(parentNode) ;
						System.out.println("Recoroling "+parentNode+" + "+grandParentNode);
						//update the reference
						curr = parentNode ;
						parentNode = curr.getParent() ;
					}
					
					leftRotate(grandParentNode) ;
					System.out.println("Recoroling "+parentNode+" + "+grandParentNode);
					NodeColor tempColor = parentNode.getColor() ;
					parentNode.setColor(grandParentNode.getColor());
					grandParentNode.setColor(tempColor);
					curr = parentNode ;
				}
			}
			
			if(root.getColor() == NodeColor.RED){
				System.out.println("Recoring the root to the black...");
				root.setColor(NodeColor.BLACK) ;
			}
			
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
	
	private void rightRotate(Node curr){
		
		System.out.println("Rotate right on node: " + curr);
		
		Node tempLeftNode = curr.getLeftChild() ;
		Node t = tempLeftNode.getRightChild() ;
		tempLeftNode.setRightChild(curr);
		curr.setLeftChild(t);
		
		tempLeftNode.setParent(curr.getParent().getParent());
		curr.setParent(tempLeftNode);
		
	}
	
	private void leftRotate(Node curr){
		
		System.out.println("Rotate left on node: " + curr);
		
		Node tempRightNode = curr.getRightChild() ;
		Node t = tempRightNode.getLeftChild() ;
		tempRightNode.setLeftChild(curr);
		curr.setRightChild(t);
		
		tempRightNode.setParent(curr.getParent().getParent());
		curr.setParent(tempRightNode);
		
	}

}
