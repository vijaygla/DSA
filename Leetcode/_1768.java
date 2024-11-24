public class _1768 {

    public static String mergeAlteString(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        boolean flag = true;
        while (i < word1.length() && j < word2.length()) {
            if (flag) {
                sb.append(word1.charAt(i));
                i++;
            } 
            else {
                sb.append(word2.charAt(j));
                j++;
            }
            flag = !flag;
        }

        while (i < word1.length()) {
            sb.append(word1.charAt(i));
            i++;
        }

        while (j < word2.length()) {
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
    }
    
public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "xyz";
        System.out.println("Output: " + mergeAlteString(word1, word2));
    }
}
