public class PallindromeString {

    // using recursion
    public static boolean checkPalindrome(String s) {
        if(s.length() <= 1) {
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)) {
            return false;
        }
        return checkPalindrome(s.substring(1, s.length()-1));
    }
    
    public static void main(String[] args) {
        String s = "madam";
        System.err.println("isPalindome: " + checkPalindrome(s));
        
    }
}
