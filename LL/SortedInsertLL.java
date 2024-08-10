public class SortedInsertLL {
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node sortedInsertNode(Node head,int x){
        Node temp = new Node(x);
        if(head == null) return temp;
        if(x < head.data) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while(curr.next != null && curr.next.data < x){
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    public static void printSortedLL(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);

        System.out.println("Sorted Inserted Node LL :");
        head = sortedInsertNode(head, 5);
        head = sortedInsertNode(head, 15);
        head = sortedInsertNode(head, 25);
        printSortedLL(head);

    }
}




