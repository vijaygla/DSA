import java.util.ArrayList;
import java.util.Stack;

public class _735AstroidCollision {

  public static void main(String[] args) {
    int arr[] = { 5, 10, -5 };
    int result[] = asteroidCollision(arr);
    ArrayList<Integer> list = new ArrayList<>();
    for (int i : result) {
      list.add(i);
    }
    System.out.println(list);
  }

  public static int[] asteroidCollision(int[] arr) {
    Stack<Integer> st = new Stack<>();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        st.push(arr[i]);
      } else {
        while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(arr[i])) {
          st.pop();
        }
        if (!st.isEmpty() && st.peek() == Math.abs(arr[i])) {
          st.pop();
        } else if (st.isEmpty() || st.peek() < 0) {
          st.push(arr[i]);
        }
      }
    }

    int[] result = new int[st.size()];
    for (int i = st.size() - 1; i >= 0; i--) {
      result[i] = st.pop();
    }
    return result;
  }
}
