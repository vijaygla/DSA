public class Operation {
    Node head;
    private int size;
    Operation(){
        this.size = 0;
    }
    class Node {
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    // insert first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return; 
        }
        newNode.next=head;
        head = newNode;
        size++;
    }


    // insert Last
    public void addlast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next; 
        }
        currNode.next=newNode;
    }
    
    // print list
    public void printList(){
        if(head == null){
            System.out.println("Node is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +" ");
            currNode = currNode.next;
        }
        System.out.println();
    }


    // delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
        }
        size--;
        head = head.next;
    }


    // delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
        }
        size--;
        if(head.next == null){
            head = null;
        }
        Node secondLast=head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            secondLast = secondLast.next;
        }
    }


    public int getSize(){
        return size;
    }


    public static void main(String[] args) {
        Operation list = new Operation();
        list.addFirst("This");
        list.printList();

        list.addlast("apple");
        list.printList();

        list.deleteFirst();
        list.printList();

        System.out.println(list.getSize());
        list.addlast("ok");
        list.printList();
        System.out.println(list.getSize());
        
    }
}
