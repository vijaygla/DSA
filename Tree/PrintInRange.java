public class PrintInRange {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    
    public static Node insert (Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            // left Sub tree formed 
            root.left = insert(root.left,val);
        }
        else {
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inOrder (Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void printInRange(Node root,int x,int y){
        if(root == null){
            return;
        }
        if(root.data >= x && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data+" ");
            printInRange(root.right, x, y);
        }
        else if(root.data >= y){
            printInRange(root.left, x, y);
        }
        else {
            printInRange(root.right, x, y);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,5,7,6,2,9,0};
        Node root = null;

        for(int i=0;i<arr.length;i++){
            root = insert(root,arr[i]);
        }

        inOrder(root);
        System.out.println();

        System.out.println("print in range :");
        printInRange(root, 2, 7);


    }
}
