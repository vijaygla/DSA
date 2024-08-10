import java.util.*;

public class PrimAlgoMST {

    static boolean[] vis; // To track visited nodes

    static class edge {
        int so;
        int des;
        int wt;

        public edge(int s, int d, int w) {
            this.so = s;
            this.des = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }

        graph[0].add(new edge(0, 1, 10));
        graph[0].add(new edge(0, 2, 15));
        graph[0].add(new edge(0, 3, 30));

        graph[1].add(new edge(1, 0, 10));
        graph[1].add(new edge(1, 3, 40));

        graph[2].add(new edge(2, 0, 15));
        graph[2].add(new edge(2, 3, 50));

        graph[3].add(new edge(3, 1, 40));
        graph[3].add(new edge(3, 2, 50));
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int cost;

        public Pair(int n, int c) {
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost; // ascending
        }
    }

    public static void primAlgo(ArrayList<edge> graph[], int v) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // non MST
        pq.add(new Pair(0, 0));

        boolean[] vis = new boolean[v]; // Initialize the visited array
        int mstCost = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node] = true; // Mark current node as visited
                mstCost += curr.cost;
            }

            for (int i = 0; i < graph[curr.node].size(); i++) {
                edge e = graph[curr.node].get(i);
                if (!vis[e.des]) { // Check if the destination node is not visited
                    pq.add(new Pair(e.des, e.wt));
                }
            }

        }
        System.out.println("Minimum cost of MST: " + mstCost);
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);

        primAlgo(graph, v);

    }
}


