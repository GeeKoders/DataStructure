package Practice.Graph.PrimsEager;

import java.util.List;

public class Vertex implements Comparable<Vertex> {
	
	private String name ;
	private Edge minEdge ;
	private boolean visited ;
	private Vertex previousVertex ;
	private double minDistance = Double.MAX_VALUE ;
	private List<Edge> adjacencies ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Edge getMinEdge() {
		return minEdge;
	}
	public void setMinEdge(Edge minEdge) {
		this.minEdge = minEdge;
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
	public double getMinDistance() {
		return minDistance;
	}
	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
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
		return this.name;
	}
	@Override
	public int compareTo(Vertex otherVertex) {
		return Double.compare(this.minDistance, otherVertex.getMinDistance());
	}
	

}
