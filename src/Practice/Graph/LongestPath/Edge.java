package Practice.Graph.LongestPath;

public class Edge {
	
	private int weight ;
	private Vertex startVertex ;
	private Vertex targetVertex ;
	
	public Edge(Vertex startVertex, Vertex targetVertex, int weight) {
		this.startVertex = startVertex ;
		this.targetVertex = targetVertex ;
		this.weight = weight ;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Vertex getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	public Vertex getTargetVertex() {
		return targetVertex;
	}

	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}
	
}
