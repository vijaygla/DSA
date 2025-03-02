public class InsertAtBegin {
    
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

    public static Node insertAtBegin(Node head,int data){
        Node temp = new Node(data);
        temp.next = head;
        if(head != null){
            head.prev = temp;
        }
        return temp;
    }

    public static void printLL(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(40);
        head = insertAtBegin(head, 30);
        head = insertAtBegin(head, 20);
        head = insertAtBegin(head, 10);
        printLL(head);
    }

}


