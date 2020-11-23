package Practice.Graph.PrimAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name ;
	private boolean visited ;
	private Vertex previousVertex ;
	private List<Edge> adjacencies ;
	
	public Vertex(String name){
		this.name = name ;
		this.adjacencies = new ArrayList<>() ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
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
	
	public String toString(){
		return this.name ;
	}

}
