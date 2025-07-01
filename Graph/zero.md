# 🌐 Graphs in Data Structures (Java-Focused)

Graphs are powerful non-linear data structures that model relationships and networks. This guide covers everything you need to know about graphs using Java: types, representations, traversals, algorithms, time complexity, and key interview concepts.

---

## 🧭 Types of Graphs

| Type                      | Description                                                           |
|---------------------------|------------------------------------------------------------------------|
| **Undirected Graph**      | Edges have no direction (u ↔ v)                                       |
| **Directed Graph (Digraph)** | Edges have direction (u → v)                                    |
| **Weighted Graph**        | Edges have associated weights/costs                                  |
| **Unweighted Graph**      | Edges have no weights                                                 |
| **Cyclic Graph**          | Contains at least one cycle                                           |
| **Acyclic Graph**         | Has no cycles                                                         |
| **DAG (Directed Acyclic Graph)** | Directed with no cycles, used in scheduling                    |
| **Connected Graph**       | Path exists between every pair of nodes (in undirected graph)         |
| **Disconnected Graph**    | Some vertices are isolated                                            |

---

## 🗂️ Graph Representations

### 1. **Adjacency Matrix**
- 2D array: `matrix[i][j] = 1` if an edge exists
- Space: O(V²), Time: O(1) to check edge

### 2. **Adjacency List**
- Array/List of lists where `adj[i]` holds neighbors of vertex `i`
- Space: O(V + E), preferred for sparse graphs

### ✅ Java Example: Adjacency List
```
import java.util.*;

public class Graph {
    int V;
    List<List<Integer>> adj;

    Graph(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v); // For undirected, also add: adj.get(v).add(u);
    }
}
```
---
# ⚙️ Key Graph Algorithms & Time Complexities

This section highlights essential graph algorithms and their time complexities, especially relevant for technical interviews and competitive programming.

---

## ⚙️ Key Graph Algorithms

| Algorithm         | Purpose                                       | Time Complexity         |
|-------------------|-----------------------------------------------|--------------------------|
| **Dijkstra’s**     | Shortest path (non-negative weights)         | O((V + E) log V)         |
| **Bellman-Ford**   | Shortest path (handles negative weights)     | O(VE)                    |
| **Floyd-Warshall** | All-pairs shortest paths                     | O(V³)                    |
| **Prim’s Algorithm** | Minimum Spanning Tree (MST)               | O(E log V)               |
| **Kruskal’s Algorithm** | Minimum Spanning Tree (MST)           | O(E log E)               |
| **Topological Sort** | Ordering of DAG (Directed Acyclic Graph) | O(V + E)                 |
| **Union-Find (DSU)** | Cycle detection (used in Kruskal’s MST)  | O(α(n)) per operation    |

> ℹ️ `α(n)` is the inverse Ackermann function, which grows extremely slowly (nearly constant in practice).

---

## 🔍 Time & Space Complexities (Adjacency List Representation)

| Operation                 | Time Complexity      |
|---------------------------|----------------------|
| **Add Vertex**            | O(1)                 |
| **Add Edge**              | O(1)                 |
| **Remove Vertex**         | O(V + E)             |
| **Remove Edge**           | O(E)                 |
| **Breadth-First Search**  | O(V + E)             |
| **Depth-First Search**    | O(V + E)             |
| **Dijkstra (Min-Heap)**   | O((V + E) log V)     |
| **Prim’s Algorithm**      | O(E log V)           |
| **Kruskal’s Algorithm**   | O(E log E)           |

---

### 🧠 Notes:
- `V` = number of vertices  
- `E` = number of edges  
- Use **adjacency list** for sparse graphs (space efficient).
- Use **adjacency matrix** for dense graphs or edge lookups.

---

## 📂 License

This `.md` content is open for use in educational materials, documentation, and technical interviews.

---
