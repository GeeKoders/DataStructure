package Practice.Tree.interview;

public class TreeCompareHelper<T extends Comparable<T>> {

	public static void main(String[] args) {

		BinarySearchTree<Integer> bst1 = new BinarySearchTree<Integer>();
		bst1.insert(2);
		bst1.insert(55);
		bst1.insert(67);
		bst1.insert(12);
		bst1.insert(11);

		BinarySearchTree<Integer> bst2 = new BinarySearchTree<Integer>();
		bst2.insert(2);
		bst2.insert(55);
		bst2.insert(67);
		bst2.insert(12);
		bst2.insert(11);

		TreeCompareHelper<Integer> helper = new TreeCompareHelper<Integer>();
		System.out.println(helper.compareTrees(bst1.getRoot(), bst2.getRoot()));
	}

	public boolean compareTrees(Node<T> node1, Node<T> node2) {

		if (node1 == null || node2 == null)
			return node1 == node2;

		if (node1.getData().compareTo(node2.getData()) != 0)
			return false;

		return compareTrees(node1.getLeftChild(), node2.getLeftChild()) 
				&& compareTrees(node1.getRightChild(), node2.getRightChild());

	}

}
