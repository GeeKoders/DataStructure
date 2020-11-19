package Practice.Graph.BellmanFordAlgorithm;

import java.util.List;

public class BellmanFord {
	
	private List<Vertex> vertexList ;
	private List<Edge> edgeList ;
	
	
	public BellmanFord(List<Vertex> vertexList, List<Edge> edgeList) {
		this.vertexList = vertexList ;
		this.edgeList = edgeList  ;
	}
	
	public void bellmanFord(Vertex sourceVertex, Vertex targetVertex){
		
		sourceVertex.setMinDistance(0);
		
		for(Vertex vertex: vertexList){
			for(Edge edge: edgeList){
				
				if(edge.getStartVertex().getMinDistance() == Integer.MAX_VALUE) continue ;
				
				int newDistance = edge.getStartVertex().getMinDistance() + edge.getWeight() ;
				
				if(newDistance < edge.getTargetVertex().getMinDistance()){
					edge.getTargetVertex().setMinDistance(newDistance);
					edge.getTargetVertex().setPreviousVertex(edge.getStartVertex());
				}
				
			}
			
		}
		
		for(Edge edge: edgeList){
			if(edge.getStartVertex().getMinDistance() != Integer.MAX_VALUE){
				if( hasCycle(edge)){
					System.out.println("Negative edge weight cycles detected!");
					return ;
				}
			}
		}
		
		if(targetVertex.getMinDistance() != Integer.MAX_VALUE){
			System.out.println("There is a shortest path from source to target, with cost: " + targetVertex.getMinDistance());
			
			Vertex actualVertex = targetVertex ;
			while(actualVertex.getPreviousVertex()!=null){
				System.out.println(actualVertex+"-");
				actualVertex = actualVertex.getPreviousVertex() ;
			}
			
		}else{
			System.out.println("There is no path from source to target...");
		}
		
	}

	private boolean hasCycle(Edge edge) {
		return edge.getTargetVertex().getMinDistance() > edge.getStartVertex().getMinDistance() + edge.getWeight();
	}
	
}
