public class InsertAtBegin {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Naive Approach
    public static Node insertAtBegin(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        } else {
            Node curr = head;
            while (curr.next != head)
                curr = curr.next;
            curr.next = temp;
            temp.next = head;
            return temp;
        }
    }

    // Efficient Approach
    public static Node insertAtHead(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        } else {
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
            return temp;
        }
    }

    public static void printCircularLL(Node head) {
        if (head == null)
            return;
        Node r = head;
        do {
            System.out.print(r.data + " ");
            r = r.next;
        } while (r != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;
        System.out.println("Insert By Both Naive And Efficient Approaches:");
        head = insertAtBegin(head, 10);
        head = insertAtBegin(head, 20);
        head = insertAtBegin(head, 30);

        head = insertAtHead(head, 40);
        head = insertAtHead(head, 50);
        head = insertAtHead(head, 60);

        printCircularLL(head);
    }
}
