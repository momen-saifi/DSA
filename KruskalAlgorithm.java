import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Edge3 {
	int src, dest, weight;

	public Edge3(int src, int dest, int weight) {
		this.src = src;
		this.dest = dest;
		this.weight = weight;
	}
}

class Graph3 {
	int V, E;
	List<Edge3> edges;

	public Graph3(int V, int E) {
		this.V = V;
		this.E = E;
		this.edges = new ArrayList<>(E);
	}

	public void addEdge(int src, int dest, int weight) {
		edges.add(new Edge3(src, dest, weight));
	}

	public List<Edge3> kruskal() {
		List<Edge3> result = new ArrayList<>();
		// Sort edges by weight
		Collections.sort(edges, Comparator.comparingInt(e -> e.weight));
		// Create parent array and initialize each node as its own parent
		int[] parent = new int[V];
		for (int i = 0; i < V; i++) {
			parent[i] = i;
		}
		int i = 0;
		while (result.size() < V - 1) {
			Edge3 e = edges.get(i++);
			int x = find(parent, e.src);
			int y = find(parent, e.dest);
			
			if (x != y) { // Add edge to result if it doesn't create a cycle
				result.add(e);
				union(parent, x, y); // Union the two nodes
			}
		}
		return result;
	}

	private int find(int[] parent, int i) {
		if (parent[i] != i) {
			parent[i] = find(parent, parent[i]); // Path compression
		}
		return parent[i];
	}

	private void union(int[] parent, int x, int y) {
		int xroot = find(parent, x);
		int yroot = find(parent, y);
		parent[xroot] = yroot;
	}
}

public class KruskalAlgorithm {
	public static void main(String[] args) {
		int V = 4, E = 5;
		Graph3 graph = new Graph3(V, E);
		graph.addEdge(0, 1, 10);
		graph.addEdge(0, 2, 6);
		graph.addEdge(0, 3, 5);
		graph.addEdge(1, 3, 15);
		graph.addEdge(2, 3, 4);
		List<Edge3> result = graph.kruskal();
		for (Edge3 e : result) {
			System.out.println(e.src + " - " + e.dest + ": " + e.weight);
		}
	}
}