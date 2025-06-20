public class SwapBitManipulation {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 10; // 1010 in binary

        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        // Swap using bit manipulation
        a = a ^ b; 
        b = a ^ b; 
        a = a ^ b; 

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}


