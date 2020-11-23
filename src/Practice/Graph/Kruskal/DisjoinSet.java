package Practice.Graph.Kruskal;

import java.util.ArrayList;
import java.util.List;

public class DisjoinSet {

	private int nodeCount = 0 ;
	private int setCount = 0 ;
	private List<Node> rootNode ; //representatives
	
	public DisjoinSet(List<Vertex> vertexes) {
		this.rootNode = new ArrayList<>(vertexes.size()) ;
		makeSets(vertexes) ;
	}

	private void makeSets(List<Vertex> vertexes) {
		
		for(Vertex v: vertexes){
			makeSet(v) ;
		}
		
	}

	private void makeSet(Vertex vertex) {

		Node n = new Node(0, rootNode.size(), null) ;
		vertex.setNode(n);
		this.rootNode.add(n) ;
		this.setCount++ ;
		this.nodeCount++ ;
	}
	
}
