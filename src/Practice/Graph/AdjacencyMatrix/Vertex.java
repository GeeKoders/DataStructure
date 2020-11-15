package Practice.Graph.AdjacencyMatrix;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name ;
	private List<Vertex> adjacencyList ;
	
	public Vertex(String name) {
		this.name = name ;
		this.adjacencyList = new ArrayList<>() ;
	}
	
	public void addNeighbours(Vertex vertex){
		adjacencyList.add(vertex) ;
	}
	
	public void showNeighbours(){
		
		for(Vertex v: adjacencyList){
			System.out.println(v);
		}
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
