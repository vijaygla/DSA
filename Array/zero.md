# 📦 Arrays in Data Structures (Java Edition)

Arrays are one of the most fundamental and widely used data structures. This document provides a deep dive into arrays using **Java**, including operations, types, performance, and use cases.

---

## 📘 What is an Array?

An **array** is a fixed-size, index-based collection of elements **of the same data type**, stored in **contiguous memory**.

> ✅ In Java, arrays are objects that store multiple variables of the same type.

---

## ⚙️ Array Operations in Java

| Operation        | Description                                       | Time Complexity |
|------------------|---------------------------------------------------|------------------|
| Access           | Retrieve element by index                         | O(1)             |
| Insertion        | Add element (requires shifting)                   | O(n)             |
| Deletion         | Remove element (requires shifting)                | O(n)             |
| Search           | Find an element (linear or binary search)         | O(n) / O(log n)* |
| Traversal        | Loop through elements                             | O(n)             |

> \* Binary search requires the array to be sorted.

---

## 🧮 Types of Arrays in Java

| Type                       | Description                                                   |
|----------------------------|---------------------------------------------------------------|
| **One-Dimensional Array**  | A linear list. Example: `int[] arr = new int[5];`             |
| **Two-Dimensional Array**  | A matrix/grid. Example: `int[][] matrix = new int[3][3];`     |
| **Jagged Array**           | Array of arrays with different lengths.                       |
| **Dynamic Array (ArrayList)** | Resizable array from `java.util.ArrayList`                  |

---

## 🔎 Java Code Example

### ✅ 1D Array Traversal

```java
public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}
