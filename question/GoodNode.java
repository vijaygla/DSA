public class GoodNode {

  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
    }
  }

  public static int dfs(TreeNode node, int maxNode) {
    if (node == null)
      return 0;

    int countGoodNode = 0;
    if (node.val >= maxNode) {
      countGoodNode = 1;
      maxNode = node.val;
    }

    countGoodNode += dfs(node.left, maxNode);
    countGoodNode += dfs(node.right, maxNode);

    return countGoodNode;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(20);
    root.right = new TreeNode(5);

    int result = dfs(root, Integer.MIN_VALUE);
    System.out.println("GoodNode Count: "+result);
  }
}
