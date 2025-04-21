import java.util.Stack;

public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // push(Object element) ---> Adds an element to the top of the stack.
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s); // output as Array [10, 20, 30, 40, 50]

        // pop() ---> Removes and returns the top element of the stack.
        System.out.println("POP: " + s.pop());
        System.err.println(s);

        // peek() ---> Returns the top element without removing it.
        System.err.println("PEEK: " + s.peek());
        System.out.println(s);

        // empty() ---> Checks if the stack is empty.
        System.err.println("Check Stack is Empty or Not: " + s.empty());

        // search(Object element) ---> Searches for an element and returns its position
        // from the top of the stack if not found return -1.
        System.err.println("Position from the top of stack: " + s.search(300));
        System.out.println("POsition of 30: " + s.search(30));

        int n = s.size();
        System.out.println(s);
        System.out.println("Length: " + n);
        System.out.println("PEEK Top of stack: " + s.peek());

        System.out.println("Print all the object element using for loop:");
        for (int i = 0; i < n; i++) {
            System.out.println(s.get(i));
        }

        System.out.println("Print using for-each loop:");
        for (int a : s) {
            System.out.println(a);
        }

        System.out.println("Print all the object element using the while loop:");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

        // --------> Since stack is subset of Vector in java so also inherit the
        // properties of Vector some of them are implemented below <---------
        Stack<String> name = new Stack<>();
        name.add("Vijay Kumar Gupta");
        name.add("Aman");
        name.add("Hello world");
        System.out.println(name);

        // get(int index) ---> Retrieves the element at the given index.
        System.out.println("Access using index: " + name.get(2));

        // clear() – Removes all elements from the vector.
        name.clear();
        System.out.println(name); // return empty vector

        // isEmpty() – Checks if the vector is empty.
        System.out.println(name.isEmpty());

        // capacity() – Returns the current capacity of the vector.
        System.out.println(name.capacity());

    }
}


