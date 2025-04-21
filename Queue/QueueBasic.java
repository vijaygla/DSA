import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Inserts an element; throws an exception if full.
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q); // also print like array or vector

        Queue<String> name = new LinkedList<>();
        // Inserts an element; returns false if full.
        name.offer("Vijay");
        name.offer("aman");
        name.offer("naman");
        System.out.println(name);

        // element ---> Retrieves the head without removing; throws exception if empty.
        System.out.println("Head of Queue: "+ name.element());

        // poll() ---> Removes and returns the head; returns null if empty.
        System.out.println("POLL: "+ name.poll());
        System.out.println(name);

        // remove() ---> Removes the head; throws an exception if empty.
        System.out.println("REMOVE: "+ name.remove());
        System.out.println(name);

        // peek() ---> Retrieves the head without removing; returns null if empty.
        System.out.println("PEEK() in q: "+ q.peek());


        // size() ---> Returns the number of elements in the queue.
        System.out.println("Length of q: "+ q.size());

        // isEmpty() ---> Checks if the queue is empty.
        System.out.println("isEmpty(): "+ name.isEmpty());

        // contains(Object o) ---> Checks if the queue contains an element.
        System.out.println("Contains: "+ q.contains(50));

        // for-each loop in the queue
        System.out.println("for-each loop in the queue: ");
        for(int a : q) {
            System.out.println(a);
        }

        // while loop 
        System.out.println("print using while loop: ");
        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }

        // clear() ---> remove all the element from the queue.
        System.out.println(name);
        name.clear();
        System.out.println("clear() clear all the element from the queue: "+ name);
    }
}


