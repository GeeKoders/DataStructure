package Practice.Graph.Kruskal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgorithm {

	public void spanningTree(List<Vertex> vertexList, List<Edge> edgeList){
		
		DisjoinSet disjoinSet = new DisjoinSet(vertexList) ;
		
		List<Edge> mst = new ArrayList<Edge>() ;
		
		Collections.sort(edgeList) ;
		
		for(Edge edge: edgeList){
			Vertex u = edge.getStartVertex() ;
			Vertex v = edge.getTargetVertex() ;
			
			if(disjoinSet.find(u.getNode())!= disjoinSet.find(v.getNode())){
				mst.add(edge) ;
				disjoinSet.union(u.getNode(), v.getNode()) ;
			}
			
		}
		
		for(Edge edge: mst){
			System.out.println(edge.getStartVertex() + " " + edge.getTargetVertex() + " -- ");
		}
		
	}
	
}
