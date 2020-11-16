package Practice.Graph.CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name ;
	private boolean visited ;
	private boolean isBeingVisited ;
	private List<Vertex> adjacencyList ;
	
	public Vertex(String name) {
		this.name = name ;
		this.adjacencyList = new ArrayList<>() ;
	}
	
	public void addNeighbor(Vertex vertex){
		this.adjacencyList.add(vertex) ;
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

	public boolean isBeingVisited() {
		return isBeingVisited;
	}

	public void setBeingVisited(boolean isBeingVisited) {
		this.isBeingVisited = isBeingVisited;
	}

	public List<Vertex> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<Vertex> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}
	
	@Override
	public String toString() {
		return this.name ;
	}

}
