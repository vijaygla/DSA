public class RotateString  {

    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }

        String newString = s + s;

        return newString.contains(goal);
    }
    public static void main(String[] args) {
        boolean result = rotateString("abcde", "abced");
        System.out.println("OUTPUT: "+result);
    }
}


