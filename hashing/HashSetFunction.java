import java.util.*;

public class HashSetFunction {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        // .add()----> Top add element in the hashset
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);
        set2.add("vijay");
        set2.add("kumar");
        set2.add("gupta");
        System.out.println(set1);
        System.out.println(set2);

        // .remove()-----> To remove the object from the hashset
        set1.remove(50);
        System.out.println(set1);

        // .contains()----> To know wheather this object is in the hashset or not
        System.out.println(set1.contains(23));
        System.out.println(set1.contains(20));

        // .clear()------> To clear all the elemnet from the hashset return empty set
        // like []
        set2.clear();
        System.out.println("set2 is clear now: " + set2);

        // .isEmpty()----> T^o check wheather the hashset is empty or not
        System.out.println("Set2 is Empty: " + set2.isEmpty());

        // .size()--->return the size of the set
        System.out.println("Size of set1: " + set1.size());

        // .iterator()----> To iterate on the set
        Iterator<Integer> iterator = set1.iterator();
        System.out.println("Elements in HashSet using iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // for loop for iteration in hashset
        System.out.println("Element in hashset using for loop: ");
        for (Integer a : set1) {
            System.out.println(a);
        }

        // use of arraylist in hashset
        ArrayList<Integer> list = new ArrayList<>(set1);
        System.out.println("Element in hashset using Arraylist and for Loop: ");
        for (int i = 0; i < set1.size(); i++) {
            System.out.println(list.get(i)); // get is use to get the indexing element in the arraylist
        }
    }
}


