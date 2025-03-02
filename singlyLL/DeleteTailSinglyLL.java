public class DeleteTailSinglyLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteTail(Node head) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;
        Node curr = head;
        while (curr.next.next != null)
            curr = curr.next;
        curr.next = null;
        return head;
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
        head.next.next.next = new Node(40);

        head = deleteTail(head);
        printLL(head);
    }
}
