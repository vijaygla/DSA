import java.util.*;

public class UsingArrayList {

    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public Boolean isEmpty(int data){
            return list.size() == 0;
        }

        public void push(int data){
            list.add(data);
        }
        
        public int pop(){
            if(isEmpty(0)){
                return -1;
            }
            int top = list.remove(list.size()-1);
            return top;
        }

        public int peek(){
            if(isEmpty(0)){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty(0)){
            System.out.println(s.peek());
            s.pop();
        }
    }

}




