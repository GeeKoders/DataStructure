package Practice.Graph.AdjacencyMatrix;

public class App {

	public static int[][] adjacencyMatrix = {
		{0, 2, 4, 0},
		{0, 0, 0, 3},
		{0, 0, 0, 0},
		{0, 0, 0, 0}
	} ;
	
	public static void main(String[] args) {

		//find all edges
		for(int i=0; i<adjacencyMatrix.length; i++){
			for(int j=0; j<adjacencyMatrix.length; j++){
				if(adjacencyMatrix[i][j] !=0){
					System.out.println("Edge with weight: " + adjacencyMatrix[i][j]);
				}
			}
		}
		
		//if you know the vertices then the lookup is O(1) quite fast
		System.out.println(adjacencyMatrix[0][2]);
		
		//adjacency list representation
		
		Vertex a = new Vertex("A") ;
		Vertex b = new Vertex("B") ;
		Vertex c = new Vertex("C") ;
		Vertex d = new Vertex("D") ;
		
		a.addNeighbours(b);
		a.addNeighbours(c);
		b.addNeighbours(d);
		
		//print all neighbors
		a.showNeighbours();
		b.showNeighbours();
		c.showNeighbours();
		d.showNeighbours();
		
	}

}
