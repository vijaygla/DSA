public class DFS {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    // DFS - Inorder traversal (Left, Root, Right)
    public static void dfs(TreeNode root) {
        if (root == null)
            return;

        dfs(root.left);
        System.out.print(root.val + " ");
        dfs(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("DFS Inorder Traversal:");
        dfs(root);
    }
}

