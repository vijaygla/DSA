public class DeleteHeadSinglyLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteHead(Node head) {
        if (head == null) {
            return null;
        } else {
            return head.next;
        }
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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = deleteHead(head);
        printLL(head);
    }
}
