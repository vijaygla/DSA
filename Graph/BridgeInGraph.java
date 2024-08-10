import java.util.*;

public class BridgeInGraph {

    static class edge {
        int so;
        int des;

        public edge(int s, int d) {
            this.so = s;
            this.des = d;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 0));
        graph[3].add(new edge(3, 4));
        graph[3].add(new edge(3, 5));

        graph[4].add(new edge(4, 3));
        graph[4].add(new edge(4, 5));

        graph[5].add(new edge(5, 3));
        graph[5].add(new edge(5, 4));
    }

    public static void dfs(ArrayList<edge> graph[], int curr, boolean vis[], int dt[], int low[], int time, int parent) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (e.des == parent) {
                continue;
            } else if (!vis[e.des]) {
                dfs(graph, e.des, vis, dt, low, time, curr);
                low[curr] = Math.min(low[curr], low[e.des]);
                if (dt[curr] < low[e.des]) {
                    System.out.println("Bridge is :" + curr + "----" + e.des);
                }
            } else {
                low[curr] = Math.min(low[curr], low[e.des]);
            }
        }
    }

    public static void getBridge(ArrayList<edge> graph[], int v) {
        int dt[] = new int[v];
        int low[] = new int[v];
        int time = 0;
        boolean vis[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(graph, i, vis, dt, low, time, -1);
            }
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);

        System.out.println();
        getBridge(graph, v);
        System.out.println();
    }
}



