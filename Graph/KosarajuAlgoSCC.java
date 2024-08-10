import java.util.*;

public class KosarajuAlgoSCC {

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

        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));

        graph[1].add(new edge(1, 0));

        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 4));
    }

    public static void topSort(ArrayList<edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!vis[e.des]) {
                topSort(graph, e.des, vis, s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<edge> graph[], int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr + "  ");

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!vis[e.des]) {
                dfs(graph, e.des, vis);
            }
        }
    }

    public static void kosarajuAlgoSCC(ArrayList<edge> graph[], int v) {
        // step 1
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                topSort(graph, i, vis, s);
            }
        }

        // step 2
        ArrayList<edge> transpose[] = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            vis[i] = false;
            transpose[i] = new ArrayList<edge>();
        }

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                edge e = graph[i].get(j); // e.so (i) -> e.des
                transpose[e.des].add(new edge(e.des, e.so));
            }
        }

        // step 3
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!vis[curr]) {
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);

        kosarajuAlgoSCC(graph, v);

    }
}



