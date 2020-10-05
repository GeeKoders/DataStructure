package Practice.Tree.interview;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	@Override
	public Node<T> getRoot() {
		return root;
	}

	@Override
	public void insert(T data) {

		if (root == null) {
			root = new Node<T>(data);
		} else {
			insertNode(data, root);
		}
	}

	@Override
	public T getMaxValue() {

		if (root == null)
			return null;

		return getMax(root);
	}

	@Override
	public T getMinValue() {

		if (root == null)
			return null;

		return getMin(root);
	}

	@Override
	public void traversal() {
		if (root != null) {
			inOrderTraversal(root);
		}
	}

	private void inOrderTraversal(Node<T> node) {

		if (node.getLeftChild() != null)
			inOrderTraversal(node.getLeftChild());

		System.out.print(node + "  -->  ");

		if (node.getRightChild() != null)
			inOrderTraversal(node.getRightChild());

	}

	private Node<T> delete(Node<T> node, T data) {

		if (node == null)
			return node;

		if (data.compareTo(node.getData()) < 0) {
			node.setLeftChild(delete(node.getLeftChild(), data));
		} else if (data.compareTo(node.getData()) > 0) {
			node.setRightChild(delete(node.getRightChild(), data));
		} else {

			// we have found the node we want to remove !!!
			if (node.getLeftChild() == null && node.getRightChild() == null) {
				System.out.println("Removing a leaf node...");
				return null;
			}

			if (node.getLeftChild() == null) {
				System.out.println("Removing the right child...");
				Node<T> tempNode = node.getRightChild();
				node = null;
				return tempNode;
			} else if (node.getRightChild() == null) {
				System.out.println("Removing the left child...");
				Node<T> tempNode = node.getLeftChild();
				node = null;
				return tempNode;
			}

			// this is the node with two children case !!!
			System.out.println("Removing item with two children...");
			Node<T> tempNode = getPredecessor(node.getLeftChild());

			node.setData(tempNode.getData());
			node.setLeftChild(delete(node.getLeftChild(), tempNode.getData()));

		}

		return node;
	}

	private Node<T> getPredecessor(Node<T> node) {

		if (node.getRightChild() != null)
			return getPredecessor(node.getRightChild());

		System.out.println("Predecessor is: " + node);
		return node;
	}

	private void insertNode(T newData, Node<T> node) {

		if (newData.compareTo(node.getData()) < 0) {
			if (node.getLeftChild() != null) {
				insertNode(newData, node.getLeftChild());
			} else {
				Node<T> newNode = new Node<T>(newData);
				node.setLeftChild(newNode);
			}
		} else {
			if (node.getRightChild() != null) {
				insertNode(newData, node.getRightChild());
			} else {
				Node<T> newNode = new Node<T>(newData);
				node.setRightChild(newNode);
			}
		}
	}

	private T getMax(Node<T> node) {

		if (node.getRightChild() != null) {
			return getMax(node.getRightChild());
		}

		return node.getData();
	}

	private T getMin(Node<T> node) {

		if (node.getLeftChild() != null) {
			return getMin(node.getLeftChild());
		}

		return node.getData();
	}

	@Override
	public void delete(T data) {

		if (root != null)
			root = delete(root, data);
	}

	@Override
	public Node<T> getKSmallest(Node<T> node, int k) {
		
		//number of nodes in the left subtree
		//+1 because we count the root node of the subtree as well
		int n = treeSize(node.getLeftChild()) + 1 ;
		
		if(n==k){
			return node ;
		}
		//if teh number of nodes int the left subtree > k-th smallest item
		//it means the k-th smallest item is in the left subtree
		if(n>k) return getKSmallest(node.getLeftChild(), k) ;
		
		//if the number of nodes in the left subtree is smaller than the k-th
		//smallest item than we can discard the left subtree and consider the 
		//right subtree
		//NOW WE ARE NOT LOOKING FOR THE K-TH BUT THE K-Nth SMALLEST ITEM
		if(n<k) return getKSmallest(node.getRightChild(), k-n) ;
		
		return null;
	}

	private int treeSize(Node<T> node) {
		
		//this is the base case
		if(node==null) return 0;
		
		//recursively sum up the size of the left subtree + size of right subtree
		//size of tree = size of left subtree + size of right subtree + 1 (because of the rppt)
		return treeSize(node.getLeftChild()) + treeSize(node.getRightChild()) + 1 ;
		
	}

	@Override
	public int getAgeSum() {
		return getAges(this.root);
	}

	private int getAges(Node<T> node) {
		
		System.out.println("considering node " + node);
		
		//we have to reinitialize the variables (sum is the parent's node value so the sum of the subtrees so far)
		int sum = 0 ;
		int leftSum = 0 ;
		int rightSum = 0 ;
		
		//null nodes have sum value 0
		if(node == null){
			return 0 ;
		}
		
		//we do a simple post-order traversal because here we have to calculate both left and right value to 
		//be able to calculate the parent's value (sum of childrens' ages)
		//check the left subtree recursively
		leftSum = getAges(node.getLeftChild()) ;
		//check the right subtree recursively
		rightSum = getAges(node.getRightChild()) ;
		
		//update the sum ... given node's value is the own value + left subtree sum + right subtree sum
		System.out.println("Considering node " + node + " total ages so far is " +((((Person)node.getData()).getAge() + leftSum + rightSum)));
//		sum = ((Person)node.getData()).getAge() + leftSum + rightSum ;
		
		return sum;
	}

}
