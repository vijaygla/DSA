import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> reversedStack = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("Element in the stack:---> "+ s);

        // reverse the element of stack using the new stack
        while(!s.isEmpty()) {
            reversedStack.push(s.pop());
        }
        System.out.println("Element in reversed stack:--> "+ reversedStack);
    }
}


