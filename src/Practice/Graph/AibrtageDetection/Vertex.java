package Practice.Graph.AibrtageDetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String id ;
	private boolean visited ;
	private double minDistance = Double.MAX_VALUE ;
	private Vertex previousVertex ;
	private List<Edge> adjacencies ;
	
	public Vertex(String id) {
		this.id = id ;
		this.adjacencies = new ArrayList<>() ;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public double getMinDistance() {
		return minDistance;
	}

	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

	public Vertex getPreviousVertex() {
		return previousVertex;
	}

	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}

	public List<Edge> getAdjacencies() {
		return adjacencies;
	}

	public void setAdjacencies(List<Edge> adjacencies) {
		this.adjacencies = adjacencies;
	}

	public void addEdge(Edge edge){
		this.adjacencies.add(edge) ;
	}
	
	@Override
	public String toString() {
		return this.id ;
	}
	
	
}
