public class Main {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = new String("Apple");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

