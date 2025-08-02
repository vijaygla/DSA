import java.util.Comparator;  // Importing Comparator to create a max heap
import java.util.PriorityQueue;

public class MaxHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(6);
        pq.add(1);
        pq.add(2);
        pq.add(4);

        System.out.println("Priority Queue: " + pq); //  [6, 4, 2, 1]
        System.out.println("Max Element: " + pq.peek()); // 6
        System.out.println("Poll element: " + pq.poll()); // 6
        System.out.println("Priority Queue after poll: " + pq); //  [4, 1, 2]
    }
}

