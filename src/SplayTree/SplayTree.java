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
	public Node find(Comparable data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getMin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getMax() {
		// TODO Auto-generated method stub
		return null;
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
