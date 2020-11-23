package Practice.Graph.PrimAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Algorithm {

	private List<Vertex> unviustedVertices ;
	private List<Edge> spanningTree ;
	private PriorityQueue<Edge> edgeHeap ;
	private double fullCost ;
	
	public Algorithm(List<Vertex> unviustedVertices) {
		this.spanningTree = new ArrayList<>() ;
		this.unviustedVertices = unviustedVertices ;
		this.edgeHeap = new PriorityQueue<Edge>() ;
	}
	
	public void primsAlgorithm(Vertex vertex){
		
		unviustedVertices.remove(vertex) ;
		
		while(!unviustedVertices.isEmpty()){
			
			for(Edge edge: vertex.getAdjacencies()){
				
				if(this.unviustedVertices.contains(edge.getTargetVertex())){
					this.edgeHeap.add(edge) ;
				}
				
			}
			
			Edge minEdge = this.edgeHeap.remove() ;
			this.spanningTree.add(minEdge) ;
			this.fullCost += minEdge.getWeight() ;
			
			vertex = minEdge.getTargetVertex() ;
			this.unviustedVertices.remove(vertex) ;
			
		}
		
		
	}
	
	public void showMST(){
		
		System.out.println("The minimum spanning tree cost: " + this.fullCost);
		
		for(Edge edge: this.spanningTree){
			System.out.println(edge.getStartVertex()+"-"+edge.getTargetVertex());
		}
	}
}
