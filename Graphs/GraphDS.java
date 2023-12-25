import java.util.*;

public class GraphDS {
    
    static class Edge {
        int source;
        int destination;
        int weight;
        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;

        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 4, 10));
        // graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 5));
        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));

        graph[4].add(new Edge(4, 2, 5));
        graph[4].add(new Edge(4, 3, 0));
        graph[4].add(new Edge(4, 5, -1));

        graph[5].add(new Edge(5, 3, 5));
        graph[5].add(new Edge(5, 4, 0));
        graph[5].add(new Edge(5, 6, -1));
        graph[5].add(new Edge(6, 5, 7));
    }
    
    public static void bfs(ArrayList<Edge> graph[], int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.poll();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.destination);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] visited) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.destination])
                dfs(graph, e.destination, visited);
        }
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean[] visited = new boolean[V];

        // for (int i = 0; i < graph[2].size(); i++) {
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.destination + " " + e.weight);
        // }
        // bfs(graph, V);
        // System.out.println();
        dfs(graph, 0, visited);
    }
}