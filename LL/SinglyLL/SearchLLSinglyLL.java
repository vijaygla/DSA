public class SearchLLSinglyLL {
    
    // Iterative function 
    public static int searchNodePosition(Node head, int x){
        int pos = 1;
        Node curr = head;
        while(curr != null){
            if(curr.data == x){
                return pos;
            }
            else{
                pos++;
                curr=curr.next;
            }
        }
        return -1;
    }

    // Recursive Function 
    public static int searchNodePositionRecursive(Node head,int x){
        if(head == null) return -1;
        if(head.data == x){
            return 1;
        }
        else{
            int res = searchNodePositionRecursive(head.next, x);
            if(res == -1) return -1;
            else return (res+1);
        }
    }

    public static void printLL(Node head){
        Node curr=head;
        while(curr != null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        // int result = searchNodePosition(head, 30);
        // System.out.println("Position : "+result);
        printLL(head);
        int result = searchNodePositionRecursive(head, 30);
        System.out.println("Position : "+result);
    }

}

