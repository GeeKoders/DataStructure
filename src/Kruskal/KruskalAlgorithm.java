package Kruskal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgorithm {

	public void spanningTree(List<Vertex> vertexList, List<Edge> edgeList) {

		DisjointSet disjointSet = new DisjointSet(vertexList);

		/* Create a list of edges */
		List<Edge> mst = new ArrayList<Edge>();

		/* Java's modified version of mergesort guarantees nlog(n) time here */
		Collections.sort(edgeList);

		/* Kruskal's algorithm */
		for (Edge edge : edgeList) {
			Vertex u = edge.getStartVertex();
			Vertex v = edge.getTargetVertex();
			if (disjointSet.find(u.getNode()) != disjointSet.find(v.getNode())) {
				/* Vertices v and u are not in the same component */
				mst.add(edge);

				/* Union them in the tree */
				disjointSet.union(u.getNode(), v.getNode());
			}
		}

		for (Edge edge : mst) {
			System.out.print(edge.getStartVertex() + " "+ edge.getTargetVertex() + " -- ");
		}

	}

}
