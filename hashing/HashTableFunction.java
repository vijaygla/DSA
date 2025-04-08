import java.util.*;

public class HashTableFunction {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();

        table.put("Vijay", 20);
        table.put("kumar", 21);
        table.put("Gupta", 22);

        System.out.println(table);
    }
}

// HashMap is not synchronized (not thread-safe), whereas Hashtable is synchronized (thread-safe).
