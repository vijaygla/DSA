public class DeleteAtHead {
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    // Naive Appproch
    public static Node deleteAtHead(Node head){
        if(head == null) return null;
        if(head.next == head) return null;
        Node curr = head;
        while(curr.next != head)
            curr = curr.next;
        curr.next = head.next;
        return curr.next;
    }

    // Efficient approch 
    public static Node deleteHeadNode(Node head){
        if(head == null || head.next == head){
            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next.next;
        return head;
    }

    public static void printCircularLL(Node head){
        if(head == null) return;
        Node curr = head;
        do{
            System.out.println(curr.data);
            curr = curr.next;
        }while(curr != head);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;

        System.out.println("Print by Naive Solution :");
        head = deleteAtHead(head);
        printCircularLL(head);

        System.out.println("Print by Efficient Solution :");
        head = deleteHeadNode(head);
        printCircularLL(head);

    }
}


