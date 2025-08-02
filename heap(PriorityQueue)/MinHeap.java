import java.util.PriorityQueue;

public class MinHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(6);
        pq.add(1);
        pq.add(2);
        pq.add(4);

        System.out.println("Priority Queue: " + pq); //  [1, 4, 2, 6]
        System.out.println("Min Element: " + pq.peek()); // 1
        System.out.println("Poll element: " + pq.poll()); // 1
        System.out.println("Priority Queue after poll: " + pq); //  [2, 4, 6]
    }
}
