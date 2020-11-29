package Practice.Graph.TarjanSCC;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name ;
	private boolean visited ;
	private List<Vertex> neighbourList ;
	private Vertex predecessor ;
	private int lowLink ;

	public Vertex(String name) {
		this.name = name ;
		this.neighbourList = new ArrayList<>() ;
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

	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public void setNeighbourList(List<Vertex> neighbourList) {
		this.neighbourList = neighbourList;
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public int getLowLink() {
		return lowLink;
	}

	public void setLowLink(int lowLink) {
		this.lowLink = lowLink;
	}
	
	public void addNeighbour(Vertex vertex){
		this.neighbourList.add(vertex) ;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
