import java.util.Stack;

public class _394Decode {

  public static String decodeString(String s) {
    Stack<Integer> numStack = new Stack<>();
    Stack<String> strStack = new Stack<>();
    String currStr = "";
    int k = 0;

    for (char ch : s.toCharArray()) {
      if (Character.isDigit(ch)) {
        k = k * 10 + (ch - '0');
      } else if (ch == '[') {
        numStack.push(k);
        strStack.push(currStr);
        currStr = "";
        k = 0;
      } else if (ch == ']') {
        StringBuilder sb = new StringBuilder(strStack.pop());
        int currentK = numStack.pop();
        for (int i = 0; i < currentK; i++) {
          sb.append(currStr);
        }
        currStr = sb.toString();
      } else {
        currStr += ch;
      }
    }
    return currStr;
  }

  public static void main(String[] args) {
    String s = "3[a]2[bc]";
    System.out.println("OUTPUT:"+ decodeString(s));
  }
}

