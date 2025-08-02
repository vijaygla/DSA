import java.util.PriorityQueue;

public class MaxHeapPriorityQueue {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.add(10);
        maxHeap.add(3);
        maxHeap.add(8);
        maxHeap.add(9);
        maxHeap.add(4);
        
        System.out.println("Max Heap: " + maxHeap); // [6, 4, 2, 1]
        System.out.println("Max Element: " + maxHeap.peek()); // 6
        System.out.println("Poll element: " + maxHeap.poll()); // 6
        System.out.println("Max Heap after poll: " + maxHeap); // [4, 1, 2]
        System.out.println("Size of Max Heap: " + maxHeap.size()); // 3
    }
}

