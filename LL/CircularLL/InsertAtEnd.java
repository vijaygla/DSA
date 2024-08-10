public class InsertAtEnd {

    // Naive Approch 
    public static Node insertAtEnd(Node head,int x){
        Node temp = new Node(x);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        else{
            Node curr = head;
            while(curr.next != head)
                curr = curr.next;
            curr.next = temp;
            temp.next = head;
            return head;
        }
    }

    // Efficient Approch 
    public static Node insertNodeAtEnd(Node head,int x){
        Node temp = new Node(x);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        else{
            temp.next = head.next;
            head.next = temp;
            int t = temp.data;
            temp.data = head.data;
            head.data = t;
            return temp;
        }
    }

    public static void printCircularLL(Node head){
        if(head == null) return;
        Node n = head;
        do{
            System.out.println(n.data+" ");
            n=n.next;
        }
        while(n != head);
    }

    public static void main(String[] args) {
        Node head = null;//intialy head is empty 
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);

        head = insertNodeAtEnd(head, 30);
        head = insertNodeAtEnd(head, 40);
        head = insertNodeAtEnd(head, 50);

        System.out.println("Insert Node by using Naive and Efficeint :");
        printCircularLL(head);
    }

}


