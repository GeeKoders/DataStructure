package Practice.Graph.PrimAlgorithm;

public class Edge implements Comparable<Edge> {

	private double weight; 
	private Vertex startVertex ;
	private Vertex targetVertex ;
	
	public Edge(Vertex startVertex, Vertex targetVertex, double weight) {
		this.startVertex = startVertex ;
		this.targetVertex = targetVertex ;
		this.weight = weight ;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
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
	
	@Override
	public int compareTo(Edge edge){
		return Double.compare(this.weight, edge.getWeight()) ;
	}
	
	
}
