package AVL;

public class AvlTree implements Tree {

	private Node root;

	// 6
	@Override
	public void insert(int data) {

		root = insert(root, data);

	}
	//7
	private Node insert(Node node, int data) {

		if (node == null) {
			return new Node(data);
		}

		if (data < node.getData()) {
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
	private Node settleViolation(int data, Node node) {

		int balance = getBalance(node);

		// this is the Case I left - left (left heavy situation)
		if (balance > 1 && data < node.getLeftNode().getData()) {
			return rightRotation(node);
		}

		// this is the Case II right - right (right heavy situation)
		if (balance < -1 && data > node.getRightNode().getData()) {
			return leftRotation(node);
		}

		// left right rotation
		if (balance > 1 && data > node.getLeftNode().getData()) {
			node.setLeftNode(leftRotation(node.getLeftNode()));
			return rightRotation(node);
		}

		// right left rotation
		if (balance < -1 && data < node.getRightNode().getData()) {
			node.setRightNode(rightRotation(node.getRightNode()));
			return leftRotation(node);
		}

		return node;
	}

	// 5
	private Node rightRotation(Node node) {

		System.out.println("Rotating to the right on node: " + node);
		Node tempLeftNode = node.getLeftNode();
		Node t = tempLeftNode.getRightNode();

		tempLeftNode.setRightNode(node);
		node.setLeftNode(t);

		node.setHeight(Math.max(height(node.getLeftNode()),
				height(node.getRightNode())) + 1);
		tempLeftNode.setHeight(Math.max(height(tempLeftNode.getLeftNode()),
				height(tempLeftNode.getRightNode())) + 1);
		return tempLeftNode;
	}

	// 5
	private Node leftRotation(Node node) {

		System.out.println("Rotating to the left node: " + node);
		Node tempRightNode = node.getRightNode();
		Node t = tempRightNode.getLeftNode();

		tempRightNode.setLeftNode(node);
		node.setRightNode(t);

		node.setHeight(Math.max(height(node.getLeftNode()),
				height(node.getRightNode())) + 1);
		tempRightNode.setHeight(Math.max(height(tempRightNode.getLeftNode()),
				height(tempRightNode.getRightNode())) + 1);
		return tempRightNode;
	}

	// 3
	private int height(Node node) {

		if (node == null)
			return -1;
		return node.getHeight();
	}

	// 4
	private int getBalance(Node node) {

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
	public void inOrderTraversal(Node node) {

		if (node.getLeftNode() != null) {
			inOrderTraversal(node.getLeftNode());
		}

		System.out.println(node);

		if (node.getRightNode() != null) {
			inOrderTraversal(node.getRightNode());
		}

	}

}
