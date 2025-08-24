import java.util.Collections;
import java.util.Vector;

public class VectorCollection {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(30);
        v.add(60);
        v.add(20);
        System.out.println("Original vector: " + v);

        Collections.sort(v);
        System.out.println("Sorted vector: " + v);

        v.remove(2);
        System.out.println("Vector after remove 2nd index element: "  + v);

        System.out.print("Print vector using for loop: ");
        for(int i=0; i<v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }
    }
}


