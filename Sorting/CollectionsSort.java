import java.util.*;

public class CollectionsSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(5);
        list.add(11);
        

        Collections.sort(list);
        System.out.println(list);
        
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}


