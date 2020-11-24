package Practice.Graph.PrimsEager;

import java.util.List;
import java.util.PriorityQueue;

public class Algorithm {
	
	private List<Vertex> vertexList ;
	
	private PriorityQueue<Vertex> heap ;
	
	public Algorithm(Graph graph) {
		this.vertexList = graph.getVertexList() ;
		heap = new PriorityQueue<>() ;
	}
	
	public void spanningTree(){
		
		for(Vertex vertex : vertexList){
			
			if(!vertex.isVisited()){
				greedyPrim(vertex) ;
			}
			
		}
		
	}

	private void greedyPrim(Vertex vertex) {
		
		vertex.setMinDistance(0);
		heap.add(vertex) ;
		
		while(!heap.isEmpty()){
			Vertex v = heap.remove() ;
			scanVertex(v) ;
		}
		
	}

	private void scanVertex(Vertex vertex) {
		
		vertex.setVisited(true);
		
		for(Edge edge: vertex.getAdjacencies()){
			
		}
		
	}
	
	
}
