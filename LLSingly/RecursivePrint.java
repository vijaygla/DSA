public class RecursivePrint {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printLLRecursive(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        printLLRecursive(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printLLRecursive(head);
    }
}
