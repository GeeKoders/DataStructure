package Practice.Graph.DijsktraAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijsktraAlgorithm {

	public void computePaths(Vertex sourceVertex){
		
		sourceVertex.setDistance(0) ;
		
		PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>() ;
		priorityQueue.add(sourceVertex) ;
		
		while(!priorityQueue.isEmpty()){
			
			Vertex actualVertex = priorityQueue.poll() ;
			
			for(Edge edge: actualVertex.getAdjacenciesList()){
				
				Vertex v = edge.getTargetVertex() ;
				
				double newDisance = actualVertex.getDistance() + edge.getWeight() ;
				
				if(newDisance < v.getDistance()){
					priorityQueue.remove(v) ;
					v.setDistance(newDisance) ;
					v.setPredecessor(actualVertex);
					priorityQueue.add(v) ;
				}
				
			}
			
		}
		
	}
	
	public List<Vertex> getShortestPathTo(Vertex targetVertex){
		
		List<Vertex> shortestPathToTarget = new ArrayList<>() ;
		
		for(Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()){
			shortestPathToTarget.add(vertex) ;
		}
		
		Collections.reverse(shortestPathToTarget) ;
		
		return shortestPathToTarget ;
	}
	
}
