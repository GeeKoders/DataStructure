package Trie;

import java.util.ArrayList;
import java.util.List;

public class Trie {

	private Node root;
	
	private int indexOfSingleChild;

	public Trie() {
		this.root = new Node("");
	}

	public void insert(String key, int value) {

		Node tempNode = root;

		for (int i = 0; i < key.length(); ++i) {

			char c = key.charAt(i);
			int ascii = (int) c;
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

	// O(length(key))
	public Integer searchAsMap(String key) {

		Node trieNode = root;

		for (int i = 0; i < key.length(); ++i) {

			char c = key.charAt(i);
			int ascIndex = c - 'a';

			if (trieNode.getChild(ascIndex) != null) {
				trieNode = trieNode.getChild(ascIndex);
			} else {
				return null;
			}
		}

		return trieNode.getValue();

	}

	public List<String> allWordsWithPrefix(String prefix) {

		Node trieNode = root;
		List<String> allWords = new ArrayList<>();

		for (int i = 0; i < prefix.length(); ++i) {

			char c = prefix.charAt(i);
			int ascIndex = c - 'a';
			trieNode = trieNode.getChild(ascIndex);
		}

		collect(trieNode, prefix, allWords);

		return allWords;

	}
	
	public String longestCommonPrefix() {
		
		Node trieNode = root;
		String lcp = "";
		
		while( countNumOfChildren(trieNode) == 1 && !trieNode.isLeaf() ) {
			trieNode = trieNode.getChild(indexOfSingleChild);
			lcp = lcp + String.valueOf((char) (indexOfSingleChild+'a'));
		}
		
		return lcp;
	}
	
	private int countNumOfChildren(Node trieNode) {
		
		int numOfChildren = 0;
		
		for(int i=0;i<trieNode.getChildren().length;++i) {
			if( trieNode.getChild(i) != null ) {
				numOfChildren++;
				indexOfSingleChild = i;
				System.out.println("indexOfSingleChild:" + indexOfSingleChild);
			}
		}
		
		return numOfChildren;
	}
	
	

	private void collect(Node node, String prefix, List<String> allWords) {

		if (node == null)
			return;

		if (node.isLeaf()) {
			allWords.add(prefix);
		}

		for (Node childNode : node.getChildren()) {

			if (childNode == null)
				continue;
			String childCharacter = childNode.getCharacter();
			collect(childNode, prefix + childCharacter, allWords);
		}

	}

}
