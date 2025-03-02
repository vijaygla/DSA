public class InsertHeadSinglyLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertAtBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    public static void printLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtBegin(head, 30);
        head = insertAtBegin(head, 20);
        head = insertAtBegin(head, 10);
        head = insertAtBegin(head, 5);
        printLL(head);
    }
}


// Time complexity of algorithm is O(n);
