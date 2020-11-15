package Practice.Graph.DepthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {

	private Stack<Vertex> stack;

	public DFS() {
		this.stack = new Stack<>();
	}
	
	

	public void dfsWithStack(Vertex rootVertex) {

		this.stack.add(rootVertex);
		rootVertex.setVisited(true);

		while (!stack.isEmpty()) {

			Vertex actualVertex = this.stack.pop();
			System.out.println(actualVertex + " ");

			for (Vertex vertex : actualVertex.getNeighbourList()) {
				if (!vertex.isVisited()) {
					vertex.setVisited(true);
					this.stack.push(vertex);
				}
			}

		}

	}
	
	public void dfsWithStack2(Vertex rootVertex) {

		this.stack.add(rootVertex);
		rootVertex.setVisited(true);

		while (!stack.isEmpty()) {

			Vertex actualVertex = this.stack.pop();
			System.out.println(actualVertex + " ");

			dfsRecursive(actualVertex);

		}

	}
	
	private void dfsRecursive(Vertex actualVertex){
		
		for (Vertex vertex : actualVertex.getNeighbourList()) {
			if (!vertex.isVisited()) {
				vertex.setVisited(true);
				this.stack.push(vertex);
			}
		}
	}

}
