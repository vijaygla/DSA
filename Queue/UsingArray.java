public class UsingArray {

    static class Queue {
        int arr[];
        int size;
        int rear;

        Queue(int n){
            arr = new int[n];
            this.size = n;
            this.rear = -1;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        // enqueue  TC = O(1)
        public void add(int data){
            if(rear == size-1){
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        
        // dequeue  TC = O(n)
        public int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        // peek TC=O(n)
        public int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(3); // Set the size to 3
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
