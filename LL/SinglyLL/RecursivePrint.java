public class RecursivePrint {

    public static void printLLRecurive(Node head){
        if(head == null)
            return;
        System.out.println(head.data+" ");
        printLLRecurive(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printLLRecurive(head);
    }

}
