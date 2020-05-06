package TST;

public class TST {

	private Node rootNode;

	public void put(String key, int value) {
		rootNode = put(rootNode, key, value, 0);
	}

	public Node put(Node node, String key, int value, int index) {

		char c = key.charAt(index);
		System.out.println("index:" + index);
		System.out.println("c:" + c);
		
		if (node == null)
			node = new Node(c);
		
		System.out.println("initial:" + node.getCharacter());

		if (c < node.getCharacter()) {
			System.out.println("c < node.getCharacter():" + node.getCharacter());
			node.setLeftNode(put(node.getLeftNode(), key, value, index));
		} else if (c > node.getCharacter()) {
			System.out.println("c > node.getCharacter():" + node.getCharacter());
			node.setRigghtNode(put(node.getRigghtNode(), key, value, index));
		} else if (index < key.length() - 1) {
			System.out.println("node.setMiddleNode()");
			node.setMiddleNode(put(node.getMiddleNode(), key, value, index + 1));
		} else {
			System.out.println("node.setValue()");
			node.setValue(value);
		}

		return node;

	}

	public Integer get(String key) {

		Node node = get(rootNode, key, 0);

		if (node == null)
			return null;

		return node.getValue();

	}

	private Node get(Node node, String key, int index) {

		if (node == null)
			return null;

		char c = key.charAt(index);

		if (c < node.getCharacter()) {
			return get(node.getLeftNode(), key, index);
		} else if (c > node.getCharacter()) {
			return get(node.getRigghtNode(), key, index);
		}else if(index < key.length() - 1){
			return get(node.getMiddleNode(), key, index+1) ;
		}else {
			return node;
		}

	}

}
