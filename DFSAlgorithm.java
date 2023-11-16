import java.util.ArrayList;
import java.util.List;

class Edge2 {
    int src, dest, weight;
    public Edge2(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Graph2 {
    int V;
    List<List<Edge2>> adjList;
    boolean[] visited;

    public Graph2(int V) {
        this.V = V;
        this.adjList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        visited = new boolean[V];
    }

    public void addEdge(int src, int dest, int weight) {
        adjList.get(src).add(new Edge2(src, dest, weight));
        adjList.get(dest).add(new Edge2(dest, src, weight)); // Undirected graph
    }

    public void dfs(int start) {
        visited[start] = true;
        System.out.print(start + " ");
        for (Edge2 neighbor : adjList.get(start)) {
            int w = neighbor.dest;
            if (!visited[w]) {
                dfs(w);
            }
        }
    }
}

public class DFSAlgorithm {
    public static void main(String[] args) {
        int V = 4;
        Graph2 graph = new Graph2(V);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 6);
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 3, 15);
        graph.addEdge(2, 3, 4);
        System.out.println("Depth-First Search Traversal:");
        graph.dfs(0);
    }
}