public class HCF {

    // Naive approch
    public static int hcfIterative(int num1, int num2) {
        int min = Math.min(num1, num2);
        int hcf = 0;
        for(int i=1; i<=min; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }
    
    // Eucleadean approch---> Tell when smaller number is subtracted from the bigger one hcf not changes.
    public static int hcfIterativeEucleadean(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;   
        }
        return num1;
    }

    public static int hcfRecursiveEuledean(int num1, int num2) {
        if(num2 == 0) {
            return num1;
        }
        return hcfRecursiveEuledean(num2, num1 % num2);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        System.err.println("hcf using naive approch: " + hcfIterative(num1, num2));

        System.err.println("hcf using iterative euclidean approch: " + hcfIterativeEucleadean(num1, num2));

        System.err.println("hcf using Recursive euclidean approch: " + hcfRecursiveEuledean(num1, num2));
    }
}
