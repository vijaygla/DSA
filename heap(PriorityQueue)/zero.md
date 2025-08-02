# Heap (Priority Queue)

## 📌 What is a Heap?
A Heap is a special tree-based data structure that satisfies the **heap property**:
- **Max Heap**: Parent node is always greater than or equal to child nodes.
- **Min Heap**: Parent node is always less than or equal to child nodes.

A heap is always a **complete binary tree**, meaning all levels are fully filled except possibly the last level.

---

## 🧠 Heap Types

| Type      | Condition                                  |
|-----------|--------------------------------------------|
| Max Heap  | parent ≥ children                          |
| Min Heap  | parent ≤ children                          |

---

## 🔁 Time Complexities

| Operation     | Complexity |
|---------------|------------|
| Insert        | O(log n)   |
| Get Max/Min   | O(1)       |
| Delete Max/Min| O(log n)   |
| Heapify       | O(n)       |
| Build Heap    | O(n)       |

---

## ⚙️ Operations

### ✅ Insertion
1. Insert at end.
2. Bubble up (heapify up).

### ❌ Deletion
1. Remove root.
2. Replace with last element.
3. Heapify down.

---

## 📦 Applications

- Priority Queues
- Dijkstra’s Algorithm
- Huffman Coding
- Top-K Elements
- Median of Stream

---

## 💡 Priority Queue

A Priority Queue is an abstract data type where each element has a **priority**. Elements with higher priority are dequeued before lower priority ones.

**Implementation:** Usually done using **heaps**.

---

## 🧮 Implementation (Java)

### Min Heap using PriorityQueue:
```java
import java.util.PriorityQueue;

PriorityQueue<Integer> minHeap = new PriorityQueue<>();
minHeap.add(10);
minHeap.add(5);
minHeap.add(20);

System.out.println(minHeap.poll()); // 5
