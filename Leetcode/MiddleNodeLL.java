public class MiddleNodeLL {
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    } 

    // Naive Solution
    public static void printMiddleNode(Node head){
        if(head == null) return;
        Node curr ;
        int count = 0;
        for(curr = head;curr != null;curr=curr.next){
            count++;
        }
        curr = head;
        for(int i=0;i<count/2;i++){
            curr=curr.next;
        }
        System.out.println("Total Node : "+count);
        System.out.println("Middle Node : "+curr.data);
    }

    // Efficient Solution 
    public static void printMiddleNode2(Node head){
        if(head == null) return;
        Node slow=head,fast=head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Node : "+slow.data);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Output By Naive Approch :");
        printMiddleNode(head);
        System.out.println("Output by Efficient Approch :");
        printMiddleNode2(head);

    }

}



