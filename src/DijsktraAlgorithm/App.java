package DijsktraAlgorithm;

public class App {

	public static void main(String[] args) {
		
		Vertex vertex0 = new Vertex("A") ;
		Vertex vertex1 = new Vertex("B") ;
		Vertex vertex2 = new Vertex("C") ;
		
		vertex0.addNeigbour(new Edge(1, vertex0, vertex1));
		vertex0.addNeigbour(new Edge(3, vertex0, vertex2));
		vertex1.addNeigbour(new Edge(1, vertex1, vertex2));
		
		
		DijsktraAlgorithm algorithm = new DijsktraAlgorithm() ;
		algorithm.computePaths(vertex0);
		
		System.out.println(algorithm.getShortestPathTo(vertex2));
	}

}