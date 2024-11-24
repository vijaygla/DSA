import java.util.*;

public class MaxDepthTree {

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

    public static int maxDepth(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int levelCount = 0;

        while(!q.isEmpty()) {
            int nodeCountAtLevel = q.size();

            while(nodeCountAtLevel > 0) {
                Node node = q.poll();
                
                if(node.left != null) {
                    q.add(node.left);
                }
                if(node.right != null) {
                    q.add(node.right);
                }
                nodeCountAtLevel--;
            }
            levelCount++;
        }
        return levelCount;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println("Maximum Depth: " + maxDepth(root));
    }
}
