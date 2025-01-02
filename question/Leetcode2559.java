public class Leetcode2559 {

  public int[] vowelStrings(String[] words, int[][] queries) {
    int n = words.length;
    int[] prefixSum = new int[n + 1];

    for (int i = 0; i < n; i++) {
      if (isVowelString(words[i])) {
        prefixSum[i + 1] = prefixSum[i] + 1;
      } else {
        prefixSum[i + 1] = prefixSum[i];
      }
    }

    int[] result = new int[queries.length];
    for (int i = 0; i < queries.length; i++) {
      int left = queries[i][0];
      int right = queries[i][1];
      result[i] = prefixSum[right + 1] - prefixSum[left];
    }

    return result;
  }

  private boolean isVowelString(String word) {
    return isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1));
  }

  private boolean isVowel(char c) {
    return "aeiou".indexOf(c) != -1;
  }
}
