import java.util.*; 

public class RootToLeafPath {

    static class Node {
        int data;
        Node left;
        Node right;
        Node (int data){
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

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static void rootToLeaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        // leaf
        if(root.left == null && root.right == null){
            printPath(path);
        }
        else { // non leaf
            rootToLeaf(root.left, path);
            rootToLeaf(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int arr[]={2,1,3,4,7,8,5};
        Node root = null;

        for(int i=0;i<arr.length;i++){
            root = insert(root,arr[i]);
        }

        rootToLeaf(root,new ArrayList<>());

    }
}




