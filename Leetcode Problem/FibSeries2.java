public class FibSeries2 {

    // recursive
    public static int printFib(int n) {
        if(n <= 1) {
            return n;
        } 
        return printFib(n-1) + printFib(n-2);
    }

    public static void main(String[] args) {
        int n = 10;
        for(int i=0; i<n; i++ ){
            System.out.print(printFib(i) + "  ");
        }
    }
}

