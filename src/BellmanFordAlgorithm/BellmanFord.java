package BellmanFordAlgorithm;

import java.util.List;

public class BellmanFord {

	private List<Edge> edgeList;

	private List<Vertex> vertexList;

	public BellmanFord(List<Edge> edgeList, List<Vertex> vertexList) {
		this.edgeList = edgeList;
		this.vertexList = vertexList;
	}

	public void bellmanFord(Vertex sourceVertex) {

		sourceVertex.setDistance(0);

		for (int i = 0; i < vertexList.size() - 1; ++i) { // V-1 iterations -->
															// we relax all the
															// edges

			for (Edge edge : edgeList) {

				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTargetVertex();

				if (u.getDistance() == Integer.MAX_VALUE) {
					continue;
				}

				double newDistance = u.getDistance() + edge.getWeight();

				if (newDistance < v.getDistance()) {
					v.setDistance(newDistance);
					v.setPreviousVertex(u);
				}
			}

		}

		for (Edge edge : edgeList) {
			if (edge.getStartVertex().getDistance() != Integer.MAX_VALUE) {
				if (hasCycle(edge)) {
					System.out
							.println("There has bean a negative cycle detected...");
					return;
				}
			}
		}

	}

	private boolean hasCycle(Edge edge) {
		return edge.getStartVertex().getDistance() + edge.getWeight() < edge
				.getTargetVertex().getDistance();
	}

	public void shortestPathTo(Vertex targetVertex) {

		if (targetVertex.getDistance() == Double.MAX_VALUE)
			System.out
					.println("There is no path from the source to the target...");

		Vertex actualVertex = targetVertex;

		while (actualVertex.getPreviousVertex() != null) {
			System.out.println(actualVertex + " - ");
			actualVertex = actualVertex.getPreviousVertex();
		}

	}

}
