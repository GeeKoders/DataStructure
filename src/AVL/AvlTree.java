package AVL;

public class AvlTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	// 6
	@Override
	public void insert(T data) {

		root = insert(root, data);

	}
	//7
	private Node<T> insert(Node<T> node, T data) {

		if (node == null) {
			return new Node(data);
		}

		if (data.compareTo( node.getData()) < 0 )  {
			node.setLeftNode(insert(node.getLeftNode(), data));
		} else {
			node.setRightNode(insert(node.getRightNode(), data));
		}

		node.setHeight(Math.max(height(node.getLeftNode()),
				height(node.getRightNode())) + 1);

		node = settleViolation(data, node);

		return node;
	}
	//8
	private Node<T> settleViolation(T data, Node<T> node) {

		int balance = getBalance(node);

		// this is the Case I left - left (left heavy situation)
		if (balance > 1 && data.compareTo( (T) node.getLeftNode().getData() ) < 0 ) {
			return rightRotation(node);
		}

		// this is the Case II right - right (right heavy situation)
		if (balance < -1 && data.compareTo( (T) node.getRightNode().getData() ) > 0 ) {
			return leftRotation(node);
		}

		// left right rotation
		if (balance > 1 && data.compareTo( (T) node.getLeftNode().getData() ) > 0 ) {
			node.setLeftNode(leftRotation(node.getLeftNode()));
			return rightRotation(node);
		}

		// right left rotation
		if (balance < -1 && data.compareTo( (T) node.getRightNode().getData() ) < 0 ) {
			node.setRightNode(rightRotation(node.getRightNode()));
			return leftRotation(node);
		}

		return node;
	}

	// 5
	private Node<T> rightRotation(Node<T> node) {

		System.out.println("Rotating to the right on node: " + node);
		Node<T> tempLeftNode = node.getLeftNode();
		Node<T> t = tempLeftNode.getRightNode();

		tempLeftNode.setRightNode(node);
		node.setLeftNode(t);

		node.setHeight(Math.max(height(node.getLeftNode()),
				height(node.getRightNode())) + 1);
		tempLeftNode.setHeight(Math.max(height(tempLeftNode.getLeftNode()),
				height(tempLeftNode.getRightNode())) + 1);
		return tempLeftNode;
	}

	// 5
	private Node<T> leftRotation(Node<T> node) {

		System.out.println("Rotating to the left node: " + node);
		Node<T> tempRightNode = node.getRightNode();
		Node<T> t = tempRightNode.getLeftNode();

		tempRightNode.setLeftNode(node);
		node.setRightNode(t);

		node.setHeight(Math.max(height(node.getLeftNode()),
				height(node.getRightNode())) + 1);
		tempRightNode.setHeight(Math.max(height(tempRightNode.getLeftNode()),
				height(tempRightNode.getRightNode())) + 1);
		return tempRightNode;
	}

	// 3
	private int height(Node<T> node) {

		if (node == null)
			return -1;
		return node.getHeight();
	}

	// 4
	private int getBalance(Node<T> node) {

		if (node == null)
			return 0;
		return height(node.getLeftNode()) - height(node.getRightNode());
	}

	// 1
	@Override
	public void traverse() {
		if (root == null)
			return;

		inOrderTraversal(root);

	}

	// 2
	public void inOrderTraversal(Node<T> node) {

		if (node.getLeftNode() != null) {
			inOrderTraversal(node.getLeftNode());
		}

		System.out.println(node);

		if (node.getRightNode() != null) {
			inOrderTraversal(node.getRightNode());
		}

	}

}
