import java.util.*;

public class MaxHeap {

    public static void main(String[] args) {
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());


        maxHeap.add(6);
        maxHeap.add(1);
        maxHeap.add(2);
        maxHeap.add(4);

        System.out.println("Priority Queue: " + maxHeap); //  [6, 4, 2, 1]
        System.out.println("Max Element: " + maxHeap.peek()); // 6
        System.out.println("Poll element: " + maxHeap.poll()); // 6
        System.out.println("Priority Queue after poll: " + maxHeap); //  [4, 1, 2]
    }
}

