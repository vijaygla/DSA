# 🧵 Java String, StringBuilder, and StringBuffer – Interview & Revision Guide

In Java, strings are core to handling textual data. Java provides three main classes:
- `String` (Immutable)
- `StringBuilder` (Mutable, not thread-safe)
- `StringBuffer` (Mutable, thread-safe)

---

## 🔍 Key Differences

| Feature            | String            | StringBuilder         | StringBuffer           |
|-------------------|-------------------|------------------------|------------------------|
| **Mutability**     | Immutable         | Mutable                | Mutable                |
| **Thread-Safety**  | No                | ❌ Not thread-safe     | ✅ Thread-safe         |
| **Performance**    | Slow for concat   | Fast                   | Slower than SB         |
| **Synchronization**| No                | No                     | Yes                    |
| **Package**        | `java.lang`       | `java.lang`            | `java.lang`            |

---

## ✅ When to Use What?

| Scenario                                 | Recommended Class     |
|------------------------------------------|------------------------|
| Constant text / configuration            | `String`              |
| Frequent modifications in single-thread  | `StringBuilder`       |
| Frequent modifications in multi-threaded | `StringBuffer`        |

---

## 📘 String Class (Immutable)

### 🔸 Key Concepts
- Once created, its value cannot be changed.
- Every modification creates a **new object** in memory.

### 🔹 Commonly Used Methods

| Method                      | Description                                |
|-----------------------------|--------------------------------------------|
| `length()`                  | Returns string length                      |
| `charAt(int index)`         | Returns char at given index                |
| `substring(start, end)`     | Returns substring                          |
| `equals()` / `equalsIgnoreCase()` | Compares strings                    |
| `compareTo()`               | Lexicographically compares strings         |
| `indexOf()` / `lastIndexOf()` | Returns index of char/substring          |
| `toLowerCase()` / `toUpperCase()` | Changes case                        |
| `trim()`                    | Removes leading/trailing spaces            |
| `replace(old, new)`         | Replaces characters                        |
| `split(regex)`              | Splits string based on delimiter           |
| `startsWith()` / `endsWith()` | Checks prefix/suffix                   |
| `contains()`                | Checks substring presence                  |
| `isEmpty()` / `isBlank()`   | Checks for empty/blank string              |
| `valueOf(x)`                | Converts primitive to string               |

### ✅ Example
```java
String s1 = "Java";
String s2 = s1.concat(" Programming");
System.out.println(s1); // Java
System.out.println(s2); // Java Programming



