public class DeleteHeadSinglyLL {
    
    public static Node deleteHead(Node head){
        if(head == null){
            return null;
        }
        else{
            return head.next;
        }
    }

    public static void printLL(Node head){
        Node curr=head;
        while(curr != null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = deleteHead(head);
        printLL(head);
    }

}


