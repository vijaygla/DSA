public class CheckEvenOdd {
    public static void main(String[] args) {
        int number = 28 ;
        // Even or Odd using bitwise operator 
        if((number & 1) != 0){
            System.out.println("Odd Number");
        }
        else{
            System.out.println("Even Number");
        }
    }
}
