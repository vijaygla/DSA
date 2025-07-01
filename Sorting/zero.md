# 🔢 All Types of Sorting Algorithms in Java

This document provides a **complete reference** for sorting algorithms used in Java, their time & space complexities, properties, and **important interview concepts**.

---

## 📚 Sorting Classification

### 🔹 Comparison-Based Sorting

- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort
- Quick Sort
- Heap Sort

### 🔹 Non-Comparison-Based Sorting

- Counting Sort
- Radix Sort
- Bucket Sort

---

## 📊 Sorting Algorithms Overview

| Algorithm       | Best Time     | Average Time  | Worst Time    | Space     | Stable | In-place | Use Case                                 |
|----------------|---------------|---------------|---------------|-----------|--------|----------|-------------------------------------------|
| **Bubble Sort** | O(n)          | O(n²)         | O(n²)         | O(1)      | ✅     | ✅       | Rarely used, educational only             |
| **Selection Sort** | O(n²)      | O(n²)         | O(n²)         | O(1)      | ❌     | ✅       | When memory is limited                    |
| **Insertion Sort** | O(n)       | O(n²)         | O(n²)         | O(1)      | ✅     | ✅       | Small datasets, partially sorted arrays   |
| **Merge Sort**  | O(n log n)    | O(n log n)    | O(n log n)    | O(n)      | ✅     | ❌       | Large datasets, guaranteed O(n log n)     |
| **Quick Sort**  | O(n log n)    | O(n log n)    | O(n²)         | O(log n)  | ❌     | ✅       | Most used, fast, good for average case    |
| **Heap Sort**   | O(n log n)    | O(n log n)    | O(n log n)    | O(1)      | ❌     | ✅       | When constant space is needed             |
| **Counting Sort** | O(n + k)    | O(n + k)      | O(n + k)      | O(k)      | ✅     | ❌       | Integers with small range                 |
| **Radix Sort**  | O(nk)         | O(nk)         | O(nk)         | O(n + k)  | ✅     | ❌       | Large numbers, sorting digits             |
| **Bucket Sort** | O(n + k)      | O(n + k)      | O(n²)         | O(n + k)  | ✅     | ❌       | Uniformly distributed floats              |

---

## 🔎 Key Properties

| Property       | Description                                                                  |
|----------------|-------------------------------------------------------------------------------|
| **Stable Sort**| Maintains relative order of equal elements. Useful in sorting objects.       |
| **In-place**   | Uses constant extra space (doesn’t require extra array).                     |
| **Divide & Conquer** | Algorithms like Merge Sort and Quick Sort use this technique.          |
| **Non-comparison** | Counting, Radix, and Bucket sort use keys or buckets instead of comparisons.|

---

## 📌 Interview Insights

### ✅ Must-Know Algorithms:
- **Quick Sort** – Most common in real-world code and interviews.
- **Merge Sort** – Preferred for linked lists and guaranteed O(n log n).
- **Heap Sort** – Conceptual clarity and max-heap logic often asked.
- **Counting Sort** – Great for small integer ranges.

### 📌 Frequently Asked Concepts:
- Difference between **Stable vs Unstable Sort**.
- Why Quick Sort is faster in practice than Merge Sort.
- When does Quick Sort degrade to O(n²)?
- Why Merge Sort is preferred for linked lists?
- Implement custom sorting using `Comparator` in Java.
- Sorting objects by fields (e.g., sort Employees by salary).
- Sort a nearly sorted array using Insertion Sort.

---

## 🛠 When to Use Which Sort?

| Situation                                  | Recommended Algorithm        |
|--------------------------------------------|------------------------------|
| Small or nearly sorted dataset             | Insertion Sort               |
| Large dataset, guaranteed O(n log n)       | Merge Sort                   |
| Average-case performance & fast            | Quick Sort                   |
| Need constant extra space                  | Heap Sort                    |
| Known integer range (small `k`)            | Counting Sort                |
| Sorting strings or long numbers by digits  | Radix Sort                   |
| Uniform float distribution (0 to 1)        | Bucket Sort                  |

---

## 📚 Java-Specific Tips

- Use `Arrays.sort(arr)` → For primitives: Dual-pivot QuickSort
- Use `Arrays.sort(arr, Comparator)` → For objects (uses TimSort)
- Use `Collections.sort(list)` → For ArrayList and similar collections
- Always override `compareTo()` or use `Comparator.comparing()` for custom object sorting

---
