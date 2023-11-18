import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Edge5 {
	int src, dest, weight;

	public Edge5(int src, int dest, int weight) {
		this.src = src;
		this.dest = dest;
		this.weight = weight;
	}
}

class Graph5 {
	int V;
	List<List<Edge5>> adjList;

	public Graph5(int V) {
		this.V = V;
		this.adjList = new ArrayList<>(V);
		for (int i = 0; i < V; i++) {
			adjList.add(new ArrayList<>());
		}
	}

	public void addEdge(int src, int dest, int weight) {
		adjList.get(src).add(new Edge5(src, dest, weight));
	}

	public List<Edge5> dijkstra(int start) {
		List<Edge5> result = new ArrayList<>();
		int[] distance = new int[V];
		boolean[] visited = new boolean[V];
		for (int i = 0; i < V; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		distance[start] = 0;
		PriorityQueue<Edge5> pq = new PriorityQueue<>((e1, e2) -> distance[e1.dest] - distance[e2.dest]);
		pq.offer(new Edge5(-1, start, 0));
		while (!pq.isEmpty()) {
			Edge5 e = pq.poll();
			if (visited[e.dest]) {
				continue;
			}
			result.add(e);
			visited[e.dest] = true;
			for (Edge5 neighbor : adjList.get(e.dest)) {
				int newDistance = distance[e.dest] + neighbor.weight;
				if (newDistance < distance[neighbor.dest]) {
					distance[neighbor.dest] = newDistance;
					pq.offer(new Edge5(e.dest, neighbor.dest, newDistance));
				}
			}
		}
		return result;
	}
}

public class DijkstraAlgorithm {
	public static void main(String[] args) {
		int V = 6;
		int start = 0;
		Graph5 graph = new Graph5(V);
		graph.addEdge(0, 1, 1);
		graph.addEdge(0, 2, 5);
		graph.addEdge(1, 3, 2);
		graph.addEdge(1, 4, 1);
		graph.addEdge(2, 4, 2);
		graph.addEdge(1, 2, 2);
		graph.addEdge(3, 5, 1);
		graph.addEdge(3, 4, 3);
		graph.addEdge(4, 5, 2);
		List<Edge5> result = graph.dijkstra(start);
		for (Edge5 e : result) {
			System.out.println(start + " - " + e.dest + ": " + e.weight);
		}
	}
}