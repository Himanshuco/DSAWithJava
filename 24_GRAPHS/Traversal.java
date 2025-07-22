import java.util.*;

public class Traversal {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    
    public static ArrayList<Edge>[] createGraph(int V) {
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        
        graph[0].add(new Edge(0, 1, 4));
        graph[0].add(new Edge(0, 2, 3));

        graph[1].add(new Edge(1, 0, 4));
        graph[1].add(new Edge(1, 3, 2));
        graph[1].add(new Edge(1, 4, 7));

        graph[2].add(new Edge(2, 0, 3));
        graph[2].add(new Edge(2, 4, 4));

        graph[3].add(new Edge(3, 1, 2));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 3));

        graph[4].add(new Edge(4, 1, 7));
        graph[4].add(new Edge(4, 2, 4));
        graph[4].add(new Edge(4, 3, 1));

        graph[5].add(new Edge(5, 3, 3));
        graph[5].add(new Edge(5, 6, 2));

        graph[6].add(new Edge(6, 5, 2));
        graph[6].add(new Edge(6, 4, 5));  

        return graph;
    }

    // Breadth First Search
    public static void bfs(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0);  // Starting BFS from vertex 0

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // Depth First Search
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean visited[]) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;  // Total vertices
        ArrayList<Edge>[] graph = createGraph(V);  

        
        System.out.println("Neighbors of vertex 2:");
        for (Edge e : graph[2]) {
            System.out.println("to: " + e.dest + " weight: " + e.wt);
        }

        // Perform BFS
        System.out.print("\nBFS Traversal: ");
        bfs(graph);

        // Perform DFS
        System.out.println();
        boolean visited[] = new boolean[graph.length];
        System.out.print("\nDFS Traversal: ");
        dfs(graph, 0, visited);  // Start DFS from vertex 0
    }
}
