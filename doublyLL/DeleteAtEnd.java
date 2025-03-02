public class DeleteAtEnd {
    
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

    public static Node deleteAtEnd(Node head){
        if(head == null || head.next == null){
            return null;
        }
        
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.prev.next = null;
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
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;
        
        head = deleteAtEnd(head);
        printLL(head);

    }
    
}



