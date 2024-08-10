public class PalindromeString {
    public static Boolean isPal(String str,int start,int end) {
        if(start >= end) {
            return true;
        }
        return(str.charAt(start) == str.charAt(end)) && isPal(str, start+1, end-1);
    }
    public static void main(String[] args) {
        String str = "abcba";
        int start = 0;
        int end = str.length() - 1;
        Boolean result = isPal(str,start,end);
        System.out.println("Palindrome : "+result);
    }
}
