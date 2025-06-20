public class TypeCasting {

    public static void main(String[] args) {

        // implicit typecasting ---> smaller datatypes are put into the bigger data types no problem created

        byte a = 10;
        int num = a;
        System.out.println(a);
        System.out.println(num);

        // explicite typecasting---> to solve the explicit typcasting problem we use next

        // method to use the typecasting in every sitution so that no problem will generated

        int b = 10;
        short number = b;
        System.out.println(b);
        System.out.println(number);

        int n = 101;
        short num1 = (short) n;
        byte num2 = (byte) n;

        System.out.println(n);
        System.out.println(num1);
        System.out.println(num2);
    }
}

