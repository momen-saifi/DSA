import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

class Edge1 {
    int src, dest, weight;
    public Edge1(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Graph1 {
    int V;
    List<List<Edge1>> adjList;
    public Graph1(int V) {
        this.V = V;
        this.adjList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int src, int dest, int weight) {
        adjList.get(src).add(new Edge1(src, dest, weight));
        adjList.get(dest).add(new Edge1(dest, src, weight)); // Undirected graph
    }
    public void bfs(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");
            for (Edge1 neighbor : adjList.get(v)) {
                int w = neighbor.dest;
                if (!visited[w]) {
                    visited[w] = true;
                    queue.add(w);
                }
            }
        }
    }
}

public class BFSAlgorithm {
    public static void main(String[] args) {
        int V = 4;
        Graph1 graph = new Graph1(V);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 6);
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 3, 15);
        graph.addEdge(2, 3, 4);
        System.out.println("Breadth-First Search Traversal:");
        graph.bfs(0);
    }
}