public class NodeAtKDistance {

  static class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
    }
  }

  public static void nodeAtKDistance(Node root, int k) {
    if (root == null)
      return;
    if (k == 0) {
      System.out.print(root.val + " ");
    } else {
      nodeAtKDistance(root.left, k - 1);
      nodeAtKDistance(root.right, k - 1);
    }
  }

  public static void main(String[] args) {
    // Create a hard coded tree.
    // 20
    // / \
    // 7 24
    // / \
    // 4 3
    // /
    // 1
    Node root = new Node(20);
    root.left = new Node(7);
    root.right = new Node(24);
    root.left.left = new Node(4);
    root.left.right = new Node(3);
    root.left.right.left = new Node(1);

    nodeAtKDistance(root, 2);
  }
}
