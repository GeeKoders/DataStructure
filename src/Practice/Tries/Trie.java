package Practice.Tries;

import java.util.ArrayList;
import java.util.List;

public class Trie {

	private Node root;
	
	public Trie() {
		this.root = new Node("");
	}

	public void insert(String key, int value) {

		Node tempNode = root;

		for (int i = 0; i < key.length(); ++i) {

			char c = key.charAt(i);
//			int ascii = (int) c;
			int asciiIndex = c - 'a';

			if (tempNode.getChild(asciiIndex) == null) {
				Node node = new Node(String.valueOf(c));
				tempNode.setChild(asciiIndex, node, value);
				tempNode = node;
			} else {
				tempNode = tempNode.getChild(asciiIndex);
			}
		}

		tempNode.setLeaf(true);
	}

	// O(length(key))
	public boolean search(String key) {

		Node trieNode = root;

		for (int i = 0; i < key.length(); ++i) {

			char c = key.charAt(i);
			int ascIndex = c - 'a';

			if (trieNode.getChild(ascIndex) == null) {
				return false;
			} else {
				trieNode = trieNode.getChild(ascIndex);
			}
		}

		if (!trieNode.isLeaf())
			return false;

		return true;

	}
	
	public Integer searchAsMap(String key) {

		Node trieNode = root;

		for (int i = 0; i < key.length(); ++i) {

			char c = key.charAt(i);
			int ascIndex = c - 'a';

			if (trieNode.getChild(ascIndex) != null) {
				trieNode = trieNode.getChild(ascIndex);
			} else {
				return null ;
			}
		}

		return trieNode.getValue();

	}

}