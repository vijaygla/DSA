public class StackUsingArray {

    int top;
    int capacity;
    int stack[];

    public StackUsingArray() {
        top = -1;
        capacity = 10;
        stack = new int[capacity];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int push(int data) {
        if (isFull()) {
            System.out.println("stack is full");
        }
        return stack[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        }
        return stack[top--];
    }

    public int peek() {
        return stack[top];
    }

    public void display() {
        for (int a : stack) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println("All the element in the stack:");
        st.display();
    }
}

