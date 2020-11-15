package Practice.Graph.TopologicalOrdering;

import java.util.Stack;

public class TopologicalOrdering {

	private Stack<Vertex> stack ;
	
	public TopologicalOrdering() {
		stack = new Stack<>() ;
	}
	
	public void dfs(Vertex vertex){
		
		stack.push(vertex) ;
		vertex.setVisited(true);
		
		while(!stack.isEmpty()){
			
			Vertex actualVertex = stack.pop() ;
			
			for(Vertex v: actualVertex.getNeighborList()){
				
				if(!v.isVisited()){
					v.setVisited(true);
					stack.push(v) ;
				}
				
			}
		}
	}
	
	public Stack<Vertex> getStack(){
		return this.stack ;
	}
	
}
