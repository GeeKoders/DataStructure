package Practice.Graph.TopologicalOrdering;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import ToplogicalOrdering.ToplogicalOrdering;
import ToplogicalOrdering.Vertex;

public class App {

	public static void main(String[] args) {
		
		ToplogicalOrdering toplogicalOrdering = new ToplogicalOrdering() ;

		List<Vertex> graph = new ArrayList<>() ;
		
//		Vertex v0 = new Vertex("0") ;
//		Vertex v1 = new Vertex("1") ;
//		Vertex v2 = new Vertex("2") ;
//		Vertex v3 = new Vertex("3") ;
//		Vertex v4 = new Vertex("4") ;
//		Vertex v5 = new Vertex("5") ;
		
		graph.add(new Vertex("0")) ;
		graph.add(new Vertex("1")) ;
		graph.add(new Vertex("2")) ;
		graph.add(new Vertex("3")) ;
		graph.add(new Vertex("4")) ;
		graph.add(new Vertex("5")) ;
				
//		v2.addNeighbour(v3);
//		v3.addNeighbour(v1);
//		v4.addNeighbour(v0);
//		v4.addNeighbour(v1);
//		v5.addNeighbour(v0);
//		v5.addNeighbour(v2);
		
		graph.get(2).addNeighbour(graph.get(3));
		graph.get(3).addNeighbour(graph.get(1));
		graph.get(4).addNeighbour(graph.get(0));
		graph.get(4).addNeighbour(graph.get(1));
		graph.get(5).addNeighbour(graph.get(0));
		graph.get(5).addNeighbour(graph.get(2));
		
		
		for(int i=0; i<graph.size(); i++){
			
			if(!graph.get(i).isVisited()){
				toplogicalOrdering.dfs(graph.get(i));
			}
		}
		
		Stack<Vertex> stack = toplogicalOrdering.getStack() ;
		
		for(int i=0; i<graph.size(); i++){
			
			Vertex vertex = stack.pop();
			System.out.print(vertex + " -> ");
			
		}
		
		
	}

}
