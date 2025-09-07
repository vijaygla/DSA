public class PrintNumberAccending {
    
    public static void printNumberAccending(int n) {
        // base case
        if(n == 0) {
            return;
        }
        printNumberAccending(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printNumberAccending(5);
    }
}
