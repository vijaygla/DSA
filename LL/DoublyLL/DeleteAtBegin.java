public class DeleteAtBegin {
    
    static class Node {
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

    public static Node deleteAtBegin(Node head){
        if(head == null) return null;
        if(head.next == null) return null;
        else{
            head=head.next;
            head.prev = null;
        }
        return head;
    }

    public static void printLL(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = deleteAtBegin(head);
        printLL(head);

    }

}



