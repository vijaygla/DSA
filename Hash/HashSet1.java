// import java .util.HashSet;
// import java.util.Iterator;
import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        System.out.println();
        HashSet<Integer> set = new HashSet<>();
        // Insert in set Varible 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // List.add(element);
        // does not contain duplicate element 
        System.out.println(set);
        // Search - contains
        if(set.contains(1)){
            System.out.println("set contain 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain 6");
        }

        // Size
        System.out.println("Size Of set : "+set.size());

        // Delete 
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("we delete 1");
        }

        // Print all element of set 
        System.out.println(set);

        // Iterative Method 
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}




