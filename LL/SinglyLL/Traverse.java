public class Traverse {
    // traverse and printLL
    public static void printLL(Node head){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data+" at address "+curr);
            curr = curr.next;
        }
    }

    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printLL(head);
    }

}
