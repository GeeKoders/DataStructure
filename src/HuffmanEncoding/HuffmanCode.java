package HuffmanEncoding;

import java.util.PriorityQueue;

public class HuffmanCode {

	public HuffmanTree buildTree(int[] charFrequencies) {

		PriorityQueue<HuffmanTree> queue = new PriorityQueue<>();

		for (int i = 0; i < charFrequencies.length; i++) {

			if (charFrequencies[i] > 0) {
				queue.add(new HuffmanLeaf(charFrequencies[i], (char) i));
			}

			while (queue.size() > 1) {
				HuffmanTree tree1 = queue.poll();
				HuffmanTree tree2 = queue.poll();

				queue.add(new HuffmanNode(tree1, tree2));

			}

		}
		return queue.poll();
	}

	public void printCodes(HuffmanTree tree, StringBuilder prefix) {

	}

}
