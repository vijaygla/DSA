# 🌳 Tree Types in Data Structures

This document provides a comprehensive comparison of various types of trees in data structures, including their binary nature, key conditions, and notable properties or usage.

---

## 📋 Comparison Table

| **Tree Type**                | **Must Be Binary?**  | **Key Conditions / Properties**                                                                                      |
|-----------------------------|----------------------|-----------------------------------------------------------------------------------------------------------------------|
| **Binary Tree**             | ✅ Yes               | Each node has **at most 2 children** (left and right).                                                               |
| **Full Binary Tree**        | ✅ Yes               | Every node has either **0 or 2 children** (never exactly 1).                                                         |
| **Perfect Binary Tree**     | ✅ Yes               | All **internal nodes have 2 children** and **all leaves are at the same depth**.                                     |
| **Complete Binary Tree**    | ✅ Yes               | All levels are completely filled **except possibly the last**, which is filled **from left to right**.               |
| **Balanced Binary Tree**    | ✅ Yes               | The height difference between left and right subtrees for any node is **O(log n)**.                                  |
| **Binary Search Tree (BST)**| ✅ Yes               | Left subtree contains keys **< root**, right subtree contains keys **> root**.                                       |
| **AVL Tree**                | ✅ Yes               | A **self-balancing BST**; balance factor (left height - right height) of every node is **-1, 0, or +1**.             |
| **Red-Black Tree**          | ✅ Yes               | A **self-balancing BST** with **coloring rules** to ensure balance (ensures O(log n) operations).                    |
| **Heap (Min/Max)**          | ✅ Yes (usually)     | A **complete binary tree** where the root is **min or max**, and every parent follows the heap property.             |
| **B-Tree**                  | ❌ No                | A **multi-way balanced tree** used in databases; nodes can have multiple keys and children.                          |
| **Trie (Prefix Tree)**      | ❌ No                | Used to store **strings** efficiently; each node can have **one child per character**.                               |
| **N-ary Tree**              | ❌ No                | A general tree where each node can have **at most N children**.                                                      |

---

## 🔍 Detailed Notes

### ✅ Binary Trees:
- These trees **strictly limit each node to 0, 1, or 2 children**.
- **Binary Search Tree, AVL Tree, Red-Black Tree, and Heaps** are all binary by structure.

### ❌ Non-Binary Trees:
- Allow **more than 2 children** per node.
- Examples include **B-Trees** (database indexing), **Tries** (prefix trees for strings), and **N-ary Trees** (general-purpose tree structures).

---

## 📘 Use Cases

| Tree Type          | Common Applications                                                   |
|--------------------|------------------------------------------------------------------------|
| Binary Tree        | Expression trees, general-purpose tree logic                          |
| BST                | Searching and sorting, symbol tables                                  |
| AVL / Red-Black    | Balanced search trees used in STL (C++ `map`, Java `TreeMap`)         |
| Heap               | Priority queues, heap sort, scheduling algorithms                     |
| B-Tree             | Databases, filesystems (e.g., NTFS, HFS+)                             |
| Trie               | Auto-complete, dictionary lookup, IP routing                          |
| N-ary Tree         | Hierarchical data (like XML, JSON, and organization charts)           |

---

## 📎 Notes for Interview

- **AVL Tree** ensures **strict balance**, while **Red-Black Tree** is more relaxed but faster in practice.
- **Complete vs Perfect Tree**: All perfect trees are complete, but not vice versa.
- **B-Tree** is not a BST – it's a general tree designed for storage efficiency, not binary search.
- **Trie** optimizes prefix-based operations – crucial for string-based problems.

---

## ✅ Visual Summary

