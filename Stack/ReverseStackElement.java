import java.util.*;
public class ReverseStackElement {

    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int temp = s.pop();
        pushAtBottom(s, data);
        s.push(temp);
    }
    
    public static void reverseStackElement(Stack<Integer> s,int data){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStackElement(s, data);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverseStackElement(s, 0);

        System.out.println("Reverse Element :");
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }        
    }
}


