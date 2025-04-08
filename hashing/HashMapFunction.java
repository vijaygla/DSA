import java.util.*;

public class HashMapFunction {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> newMap = new HashMap<>(map);

        // .put()----> To add the key values in the map
        map.put("Vijay", 20);
        map.put("Kumar", 21);
        map.put("Gupta", 22);
        System.out.println(map);

        // .get()---> Retrive the values associated with key if not exist return null
        System.err.println(map.get("vijay"));
        System.out.println(map.get("Vijay"));

        // .remove()---> remove a keyvalues pair from the map
        map.remove("Kumar");
        System.err.println(map);

        // .containsKey()----> to check wheather the key is in the map or not otherwise
        // return false
        System.out.println("Key is not found: " + map.containsKey("vijay"));
        System.out.println("Key is found in the map: " + map.containsKey("Vijay"));

        // .containsValue()----> To check wheatther this values is find in this map or
        // not otherwise return false
        System.out.println(map.containsValue(20));
        System.out.println(map.containsValue(209));

        // .clear()----> Removes all key-value pairs
        newMap.put("kumar", 101);
        System.out.println(newMap);
        newMap.clear();
        System.out.println("Now newMap is clear using the .clear(): " + newMap);

        // .isEmpty()-----> Checks if the map is empty.
        System.out.println(newMap.isEmpty());
        System.out.println(map.isEmpty());

        // .size()-----> Returns the number of key-value pairs.
        System.out.println("Size of map: " + map.size());
        System.out.println("Size of newMap: " + newMap.size());

        // .keySet()----> Returns a set of all keys.
        System.out.println("Set of key using .keySet(): " + map.keySet());

        // .values()-----> Returns a collection of all values.
        System.out.println("Set of all the values in the map using .values(): " + map.values());

        // .entrySet()----> Returns a set view of all key-value pairs.
        System.out.println("Set of all keys and values in the map: " + map.entrySet());

        // loop in the hash map
        Set<String> name = map.keySet();
        System.out.println("Age corrosponding to the name of student: ");
        for(String age : name) {
            System.out.println(map.get(age));
        }

        // Iteration in HashMap - .getKey()
        for(Map.Entry<String,Integer> element : map.entrySet()){
            System.out.print(element.getKey()+" --> ");
            System.out.println(element.getValue());
        }
    }
}

// HashMap is not synchronized (not thread-safe), whereas Hashtable is synchronized (thread-safe).



// // Notes how many types of declaration of HashMap possible in java
// HashMap<String, Integer> map = new HashMap<>();
// HashMap<String, Integer> mapWithCapacity = new HashMap<>(10);
// HashMap<String, Integer> mapWithCapacityAndLoadFactor = new HashMap<>(10,
// 0.75f);
// HashMap<String, Integer> newMapFromExistingMap = new HashMap<>(map);


