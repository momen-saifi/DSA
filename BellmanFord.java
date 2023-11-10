import java.util.ArrayList;
import java.util.List;

class Edge7 {
    int src, dest, weight;

    public Edge7(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Graph7 {
    int V;
    List<Edge7> edges;

    public Graph7(int V) {
        this.V = V;
        this.edges = new ArrayList<>();
    }

    public void addEdge(int src, int dest, int weight) {
        edges.add(new Edge7(src, dest, weight));
    }

    public List<Edge7> bellmanFord(int start) {
        int[] distance = new int[V];
        int[] parent = new int[V];
        for (int i = 0; i < V; i++) {
            distance[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }
        distance[start] = 0;

        // Relax edges V-1 times
        for (int i = 1; i < V; i++) {
            for (Edge7 edge : edges) {
                int u = edge.src;
                int v = edge.dest;
                int w = edge.weight;
                if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v]) {
                    distance[v] = distance[u] + w;
                    parent[v] = u;
                }
            }
        }

        // Check for negative-weight cycles
        for (Edge7 edge : edges) {
            int u = edge.src;
            int v = edge.dest;
            int w = edge.weight;
            if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v]) {
                throw new RuntimeException("Graph contains negative-weight cycle");
            }
        }

        // Build result list of edges
        List<Edge7> result = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (parent[i] != -1) {
                result.add(new Edge7(parent[i], i, distance[i]));
            }
        }
        return result;
    }
}

public class BellmanFord {
    public static void main(String[] args) {
        int V = 6;
        int start = 0;
        Graph7 graph = new Graph7(V);
        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 5);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 4, 1);
        graph.addEdge(2, 4, 2);
        graph.addEdge(1, 2, 2);
        graph.addEdge(3, 5, 1);
        graph.addEdge(3, 4, 3);
        graph.addEdge(4, 5, 2);
        List<Edge7> result = graph.bellmanFord(start);
        for (Edge7 e : result) {
            System.out.println(e.src + " - " + e.dest + ": " + e.weight);
        }
    }
}