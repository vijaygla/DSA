public class SearchInBST {

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

  public static Node searchInBST(Node root, int key) {
    Node curr = root;

    while (curr != null) {
      if(curr.val == key) {
        return curr;
      }
      else if(key > curr.val) {
        curr = curr.right;
      }
      else {
        curr = curr.left;
      }
    }
    return null; // Return null if the key is not found
  }

//         50
//        /  \
//       30   70
//      /  \  /  \
//     20   40 60  80

  public static void main(String[] args) {
    Node root = new Node(50);
    root.left = new Node(30);
    root.right = new Node(70);
    root.left.left = new Node(20);
    root.left.right = new Node(40);
    root.right.left = new Node(60);
    root.right.right = new Node(80);

    Node result = searchInBST(root, 70);
    if (result != null) {
      System.out.println("Node found with value: " + result.val);
    } else {
      System.out.println("Node not found");
    }
  }
}
