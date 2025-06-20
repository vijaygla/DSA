import java.util.Arrays;

public class PrintRowMatrix {

    public static void main(String[] args) {
        int matric[][] = {{1,2, 3}, {4, 5 ,6}, {7, 8, 9}};

        for(int a[] : matric) {
            System.out.println(Arrays.toString(a));
        }
    }
}


