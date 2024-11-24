public class InsertHeadSinglyLL {
    
    public static Node insertAtBegin(Node head,int x){
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    public static void printLL(Node head){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = null;
        head = insertAtBegin(head, 30);
        head = insertAtBegin(head, 20);
        head = insertAtBegin(head, 10);
        head = insertAtBegin(head, 5);
        printLL(head);
    }

}

// Time complexity of algorithm is O(n);
