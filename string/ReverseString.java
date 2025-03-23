public class ReverseString {

    public static String reverseString(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        for(int i=n-1; i>=0; i--) {
            result.append(s.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "Hello man";
        String result = reverseString(s);
        System.out.println(result);
    }
}

