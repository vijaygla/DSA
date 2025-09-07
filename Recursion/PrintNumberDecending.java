public class PrintNumberDecending {

    public static void printNumberDecending(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printNumberDecending(n-1);
    }

    public static void main(String[] args) {
        printNumberDecending(5);    
    }
}
