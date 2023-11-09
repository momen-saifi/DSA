import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Edge4 {
    int src, dest, weight;

    public Edge4(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Graph4 {
    int V;
    List<List<Edge4>> adjList;

    public Graph4(int V) {
        this.V = V;
        this.adjList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest, int weight) {
        adjList.get(src).add(new Edge4(src, dest, weight));
        adjList.get(dest).add(new Edge4(dest, src, weight));
    }

    public List<Edge4> primMST(int start) {
        List<Edge4> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        int[] key = new int[V];
        int[] parent = new int[V];

        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }

        PriorityQueue<Edge4> pq = new PriorityQueue<>((e1, e2) -> e1.weight - e2.weight);
        key[start] = 0;
        pq.offer(new Edge4(-1, start, 0));

        while (!pq.isEmpty()) {
            Edge4 e = pq.poll();
            int v = e.dest;

            if (visited[v])
                continue;

            visited[v] = true;
            if (e.src != -1)
                result.add(e);

            for (Edge4 neighbor : adjList.get(v)) {
                int u = neighbor.dest;
                int weight = neighbor.weight;
                if (!visited[u] && weight < key[u]) {
                    key[u] = weight;
                    parent[u] = v;
                    pq.offer(new Edge4(v, u, weight));
                }
            }
        }

        return result;
    }
}

public class PrimMST {
    public static void main(String[] args) {
        int V = 6;
        Graph4 graph = new Graph4(V);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 6);

        List<Edge4> result = graph.primMST(0);
        System.out.println("Edges in the Minimum Spanning Tree:");
        for (Edge4 e : result) {
            System.out.println(e.src + " - " + e.dest + ": " + e.weight);
        }
    }
}