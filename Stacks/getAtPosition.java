package Stacks;
import java.util.Stack;

public class getAtPosition {
    public static void main(String[] args) {
        Stack <Integer>st = new Stack<>();
        Stack <Integer>st2 = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        int idx = 2;
        //push at4 particular position
        while(st.size()>idx+1){
            int top = st.pop();
            st2.push(top);
        }
        st.push(50);
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);
        //get element of particular position
         while(st.size()>idx+1){
            int top = st.pop();
            st2.push(top);
        }
        System.out.println(st.peek());
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);



    }
    
}
