import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        // Even we provide the intial Capacity to al2 but we can give more than it
        ArrayList<Integer> al2 = new ArrayList<Integer>(2);
        al.add(10);
        al2.add(10);
        al2.add(11);
        al2.add(13);
        System.out.println(al2);
    }
}

