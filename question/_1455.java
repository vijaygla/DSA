public class _1455 {

  static class Solution {
    public static int isPrefixOfWord(String sentence, String searchWord) {
      String[] words = sentence.split(" ");
      for (int i = 0; i < words.length; i++) {
        if (words[i].startsWith(searchWord)) {
          return i;
        }
      }
      return -1;
    }
  }

  public static void main(String[] args) {
    String sentence = "i love to eat burger";
    String searchWord = "burg";
    int result = Solution.isPrefixOfWord(sentence, searchWord);
    System.out.println(result); // Output: 4
  }
}
