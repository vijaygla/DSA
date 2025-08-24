import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        for(int i=1; i<=5; i++) {
            list.add(i);
        }
        System.out.println("Original Linked List: " + list);

        System.err.print("printing of all the node of linked list using for loop and get method of linked list: ");
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }

        list.remove(2);
        System.out.println("Linked list after remove index 2 node: " + list);

        list.removeFirst();
        System.out.println("Linked List after remove 1st element(node):  " + list);
    }
}
