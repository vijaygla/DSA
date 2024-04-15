import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefAndRedBlackTree {
    static int Q;
    static Node root;

    public static void main(String[] args) throws IOException {
        FastReader reader = new FastReader();
        Q = reader.nextInt();
        root = new Node(1, false); // Root is initially black
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < Q; i++) {
            char type = reader.next().charAt(1); // Read the type of query
            if (type == 'i') { // Qi - Change color of all nodes
                changeColor(root);
            } else { // Qb or Qr
                int x = reader.nextInt();
                int y = reader.nextInt();
                if (type == 'b') { // Qb - Count black nodes
                    result.append(countBlackNodes(x, y)).append("\n");
                } else { // Qr - Count red nodes
                    result.append(countRedNodes(x, y)).append("\n");
                }
            }
        }
        System.out.print(result);
    }

    static void changeColor(Node node) {
        if (node == null) return;
        node.red = !node.red; // Change color of the node
        // Recursively change color of children
        changeColor(node.left);
        changeColor(node.right);
    }

    static int countBlackNodes(int x, int y) {
        Node lca = findLCA(root, x, y);
        return countBlackNodesOnPath(lca, x) + countBlackNodesOnPath(lca, y) - (lca.red ? 0 : 1);
    }

    static int countRedNodes(int x, int y) {
        Node lca = findLCA(root, x, y);
        return countRedNodesOnPath(lca, x) + countRedNodesOnPath(lca, y) - (lca.red ? 1 : 0);
    }

    static Node findLCA(Node node, int x, int y) {
        if (node == null || node.val == x || node.val == y) return node;
        Node left = findLCA(node.left, x, y);
        Node right = findLCA(node.right, x, y);
        if (left != null && right != null) return node;
        return (left != null) ? left : right;
    }

    static int countBlackNodesOnPath(Node lca, int x) {
        int count = 0;
        Node node = lca;
        while (node != null && node.val != x) {
            if (!node.red) count++;
            if (x < node.val) node = node.left;
            else node = node.right;
        }
        if (!node.red) count++; // Count the color of LCA node
        return count;
    }

    static int countRedNodesOnPath(Node lca, int x) {
        int count = 0;
        Node node = lca;
        while (node != null && node.val != x) {
            if (node.red) count++;
            if (x < node.val) node = node.left;
            else node = node.right;
        }
        if (node.red) count++; // Count the color of LCA node
        return count;
    }

    static class Node {
        int val;
        Node left, right;
        boolean red;

        Node(int val, boolean red) {
            this.val = val;
            this.red = red;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}
