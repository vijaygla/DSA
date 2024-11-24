public class PrintCircularLL {

    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    // Method 1 : by using for loop 
    public static void printCircularLL(Node head){
        if(head == null) return;
        System.out.println(head.data+" ");
        for(Node r=head.next;r != head;r=r.next){
            System.out.println(r.data+" ");
        }
    }

    // Method 2 : by using do while
    public static void printCircularLL2(Node head){
        if(head == null) return;
        Node curr = head;
        do{
            System.out.println(curr.data+" ");
            curr = curr.next;
        }while(curr != head);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;

        System.out.println("Print By Method 1:");
        printCircularLL(head);
        System.out.println("Print By Method 2:");
        printCircularLL2(head);
        
    }

}


