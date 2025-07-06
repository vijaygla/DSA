public class BST {

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

    public static Node insertNode(Node root, int k) {
        if (root == null) {
            root = new Node(k);
            return root;
        }
        if (root.data > k) {
            root.left = insertNode(root.left, k);
        } else {
            root.right = insertNode(root.right, k);
        }
        return root;
    }

    public static boolean searchNode(Node root, int k) {
        if (root == null) {
            return false;
        }
        if (root.data > k) {
            return searchNode(root.left, k);
        } else if (root.data == k) {
            return true;
        } else {
            return searchNode(root.right, k);
        }
    }
    

    public static Node deleteNode(Node root, int k) {
        if (root.data > k) {
            root.left = deleteNode(root.left, k);
        }
        else if (root.data < k) {
            root.right = deleteNode(root.right, k);
        }
        else {
            // case 1
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2
            if (root.left == null) {
                return root.right;
            } 
            else if (root.right == null) {
                return root.left;
            }

            // case 3
            Node inOrderSuccessor = successorNode(root.right);
            root.data = inOrderSuccessor.data;
            root.right = deleteNode(root.right, inOrderSuccessor.data);
        }
        return root;
    }

    // successorNode
    public static Node successorNode(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Print the Tree using the preOrder traversal method
    public static void printTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = insertNode(root, arr[i]);
        }

        System.out.print("Tree before delete: ");
        printTree(root);
        System.out.println();

        System.out.println(searchNode(root, 9));

        System.out.print("Tree after delete: ");
        deleteNode(root, 7);
        printTree(root);

    }
}

