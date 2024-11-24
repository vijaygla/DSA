public class TreeTraversal {

  // Node of tree
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  // Pre-order Traversal 
  public static void preOrder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
  }

  // In-order Traversal
  public static void inOrder(Node root) {
    if (root == null) {
      return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
  }

  // Post-order Traversal
  public static void postOrder(Node root) {
    if (root == null) {
      return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
  }

  public static void main(String[] args) {
    //          10
    //         /  \
    //        5    15
    //       / \   / \
    //      3   7 12  18
    Node root = new Node(10);
    root.left = new Node(5);
    root.right = new Node(15);
    root.left.left = new Node(3);
    root.left.right = new Node(7);
    root.right.left = new Node(12);
    root.right.right = new Node(18);

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
