package packageFolder;

public class PrintEven {
    public static void printEven(int a, int b) {
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Even Numbers:");
        printEven(5, 25);
    }
}
