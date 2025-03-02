public class InsertAtAnyPosSinglyLL {
    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node insertAtAnyPosSinglyLL(Node head, int pos, int data) {
        Node temp = new Node(data);
        if(pos == 1){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i = 1; i <= pos - 2 && curr != null; i++)
            curr = curr.next;
        if(curr == null)
            return head;
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    public static void printLL(Node head) {
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtAnyPosSinglyLL(head, 1, 10);
        head = insertAtAnyPosSinglyLL(head, 2, 20);
        head = insertAtAnyPosSinglyLL(head, 3, 30);
        printLL(head);
    }
}
