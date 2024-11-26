public class SinglyLL {

    private Node head;

    public static void main(String[] args) {
        SinglyLL sll =  new SinglyLL();
        sll.head = new Node("Vijay");
        Node second = new Node("Kumar");
        Node third = new Node("Gupta");

        sll.head.next = second;
        second.next = third;

        printSinglyLL(sll.head);
    }
    
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printSinglyLL(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
