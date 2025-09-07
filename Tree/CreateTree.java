public class CreateTree {

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Insert the node in the tree 
    public static TreeNode insertNode(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (root.data > val) {
            root.left = insertNode(root.left, val);
        }
        else {
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    // Print the tree
    public static void printTree(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            printTree(root.left);
            printTree(root.right);
        }
    }

    public static void main(String[] args) {
        int val[] = { 1, 2, 3, 4, 5 };
        TreeNode root = null;

        for (int i = 0; i < val.length; i++) {
            root = insertNode(root, val[i]);
        }

        System.out.print("Tree TreeNode: ");
        printTree(root);
    }
}
