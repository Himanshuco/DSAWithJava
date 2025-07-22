import java.util.*;

public class ConnectedComponents {
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

        // Component 1
        graph[0].add(new Edge(0, 1, 4));
        graph[0].add(new Edge(0, 2, 3));

        graph[1].add(new Edge(1, 0, 4));
        graph[1].add(new Edge(1, 3, 2));
        graph[1].add(new Edge(1, 4, 7));

        graph[2].add(new Edge(2, 0, 3));
        graph[2].add(new Edge(2, 4, 4));

        graph[3].add(new Edge(3, 1, 2));
        graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 1, 7));
        graph[4].add(new Edge(4, 2, 4));
        graph[4].add(new Edge(4, 3, 1));

        // Component 2: vertex 5 and 6 with no edges (disconnected)

        return graph;
    }

    // Breadth First Search
    public static void bfs(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                bfs_Util(graph, visited, i);
            }
        }
    }

    public static void bfs_Util(ArrayList<Edge>[] graph, boolean[] visited, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (Edge e : graph[curr]) {
                    q.add(e.dest);
                }
            }
        }
    }

    // Depth First Search
    public static void dfs(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                dfs_Util(graph, i, visited);
            }
        }
    }

    public static void dfs_Util(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                dfs_Util(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7; // Total vertices
        ArrayList<Edge>[] graph = createGraph(V);

        System.out.println("Neighbors of vertex 2:");
        for (Edge e : graph[2]) {
            System.out.println("to: " + e.dest + " weight: " + e.wt);
        }

        System.out.print("\nBFS Traversal: ");
        bfs(graph);

        System.out.print("\n\nDFS Traversal: ");
        dfs(graph);
    }
}
