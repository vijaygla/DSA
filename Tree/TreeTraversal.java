public class TreeTraversal {

  // TreeNode of tree
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

  // Pre-order Traversal
  public static void preOrder(TreeNode root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
  }

  // In-order Traversal
  public static void inOrder(TreeNode root) {
    if (root == null) {
      return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
  }

  // Post-order Traversal
  public static void postOrder(TreeNode root) {
    if (root == null) {
      return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
  }

  public static void main(String[] args) {
    // 10
    // / \
    // 5 15
    // / \ / \
    // 3 7 12 18
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(5);
    root.right = new TreeNode(15);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(7);
    root.right.left = new TreeNode(12);
    root.right.right = new TreeNode(18);

    System.out.print("Pre-order Traversal: ");
    preOrder(root);
    System.out.println();

    System.out.print("In-order Traversal: ");
    inOrder(root);
    System.out.println();

    System.out.print("Post-order Traversal: ");
    postOrder(root);
    System.out.println();
  }
}
