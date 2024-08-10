public class ReverseDoublyLL {
    
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

    public static Node reverseDoublyLL(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node prev=null;
        Node curr = head;
        while(curr != null){
            // Swapping
            prev = curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
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
        
        System.out.println("Original Doubly Linked List:");
        printLL(head);
        System.out.println();

        System.out.println("Reversed Doubly Linked List:");
        Node newHead = reverseDoublyLL(head);
        printLL(newHead);

    }

}


