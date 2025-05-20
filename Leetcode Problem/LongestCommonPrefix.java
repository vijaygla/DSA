public class LongestCommonPrefix {

    public static String longestCommonPrefix(String str[]) {
        String first = str[0];
        String last = str[str.length - 1];
        int index = 0;

        while(index < first.length() && index < last.length()) {
            if(first.charAt(index) == last.charAt(index)) {
                index++;
            }
            else {
                break;
            }
        }
        return index == 0 ? "" : first.substring(0, index);
    }

    public static void main(String[] args) {
        String str[] = {"vijay", "vikash", "vinay"};
        String result = longestCommonPrefix(str);
        System.out.println("Longest common prefix----> "+ result);
    }
}
