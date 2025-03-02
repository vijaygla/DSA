public class Traverse {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // traverse and printLL
    public static void printLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "--> ");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printLL(head);
    }
}
