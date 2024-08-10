import java.util.*;
public class UsingJavaCollectionFrameWork {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop(); // remove element after peek
        }
    }
}


