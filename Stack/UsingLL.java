public class UsingLL {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        private Node head = null;

        public void push(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public int pop() {
            if (isEmpty()) {
                return -1; // Indicate underflow
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

        public int peek() {
            if (isEmpty()) {
                return -1; // Indicate underflow
            }
            return head.data;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}


