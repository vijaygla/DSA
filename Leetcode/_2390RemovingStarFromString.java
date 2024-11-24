public class _2390RemovingStarFromString {
  public static void main(String[] args) {
    String str = "leet**cod*e";
    System.out.println(removeStars(str));
  }
  
  public static String removeStars(String s) {
    StringBuilder sb = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (c != '*') {
        sb.append(c);
      } else {
        sb.deleteCharAt(sb.length() - 1);
      }
    }
    return sb.toString();
  }
}
