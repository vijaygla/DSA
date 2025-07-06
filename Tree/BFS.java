public class BFS {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Get height of the tree
    static int height(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Print all nodes at a given level
    static void printLevel(TreeNode node, int level) {
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.val + " ");
        else {
            printLevel(node.left, level - 1);
            printLevel(node.right, level - 1);
        }
    }

    // BFS-like traversal using levels
    static void bfs(TreeNode root) {
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            printLevel(root, i);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println("BFS Level order Traversal: ");
        bfs(root); // Output: 1 2 3 4 5 6
    }
}

