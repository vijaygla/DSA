import java.util.ArrayList;
import java.util.Collections;;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> aa = new ArrayList<>();
        aa.add("Vijay");
        aa.add("Kumar");
        aa.add("Gupta");

        ArrayList<Integer> a = new ArrayList<>();
        // Add element in the arraylist
        a.add(10);
        a.add(30);
        a.add(40);
        a.add(80);
        a.add(20);
        System.out.println(a);

        // add element in the arraylist using indexing
        a.add(0, 50);
        System.out.println(a);

        // use to sort the list in arraylist
        Collections.sort(a);
        System.out.println(a);

        // get the element from the arraylist using index
        System.out.println("3rd index contain: " + a.get(3));

        // change the desired index values and return the previous values
        System.out.println(a.set(5, 500) + "  is replaced by the 500");
        System.out.println(a);

        // Removes element at index
        System.out.println(a.remove(5) + "  is 5th index element which is removed");
        System.out.println(a);

        // Removes first occurrence of the element
        boolean isRemoved = a.remove(Integer.valueOf(50)); // Removes the number 50
        System.out.println(isRemoved);

        // size of the arrayList
        System.out.println("Size of aa arraylist: " + aa.size());

        // .clone() returns an Object, you must cast it to ArrayList explicitly.
        System.out.println(aa.clone());

        // Removes all elements
        aa.clear();
        System.out.println(aa);

        // Returns true if list is empty
        System.out.println(aa.isEmpty());

        // Checks if list contains the element
        System.out.println("ArrayList aa contians the element Vijay---> " + aa.contains("Vijay"));
        System.out.println("ArrayList a contain the element 10---> " + a.contains(10));

        // Returns index of first occurrence
        System.out.println("Since 19 does not exist in the arraylist it return---> " + a.indexOf(19));
        System.out.println("Since 30 exist in the arraylist it return---> " + a.indexOf(30));

        // Returns index of last occurrence
        System.out.println("index of element from the last index: " + a.lastIndexOf(30));

        aa.add("kali");
        aa.add("linux");
        System.out.println("Arraylist: " + aa);

        // Convert the array list to the string
        System.out.println("String: " + aa.toString());

        // toArray() Converts to an Object[] array
        // Convert to array
        Object[] array = aa.toArray();
        // Iterate through the array
        System.out.println("Printing of the arrays element: ");
        for (Object n : array) {
            System.out.println(n);
        }
    }
}

