import java.util.*;

public class BFSLevelMaximumSum {

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

  public static int levelWiseMaxSum(Node root) {
    if (root == null) {
      return 0;
    }

    Queue<Node> q = new LinkedList<>();
    q.add(root);
    int maxSum = Integer.MIN_VALUE;
    int maxLevel = 0;
    int level = 0;

    while (!q.isEmpty()) {
      int currSize = q.size();
      int sum = 0;
      level++;

      for (int i = 0; i < currSize; i++) {
        Node curr = q.poll();
        sum += curr.val;

        if (curr.left != null) {
          q.add(curr.left);
        }
        if (curr.right != null) {
          q.add(curr.right);
        }
      }

      if (sum > maxSum) {
        maxSum = sum;
        maxLevel = level;
      }
    }
    return maxLevel;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(7);
    root.right = new Node(0);
    root.left.left = new Node(7);
    root.left.right = new Node(-8);

    int result = levelWiseMaxSum(root);
    System.err.println("OUTPUT: "+result);
  }
}
