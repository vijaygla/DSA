// only work in circular singly LL

public class DeleteAtAnyPos {
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node deleteAtAnyPos(Node head,int pos){
        if(head == null) return head;
        if(pos == 1) return head;
        Node curr = head;
        for(int i=0;i<pos-2;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    public static void printCircularSinglyLL(Node head){
        if(head == null) return;
        Node curr = head;
        do{
            System.out.println(curr.data);
            curr=curr.next;
        }while(curr.next != head);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = deleteAtAnyPos(head, 3);
        printCircularSinglyLL(head);

    }
}



