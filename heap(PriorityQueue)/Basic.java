import java.util.PriorityQueue;

public class Basic {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(6);
        pq.add(1);
        pq.add(2);
        pq.add(4);

        System.out.println("Priority Queue: " + pq); //  [1, 4, 2, 6]
    }
}
