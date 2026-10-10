package Stacks;
import java.util.Stack;
public class Basic {
    public static void main(String[] args) {
        Stack <String> st = new Stack<>();
        System.out.println(st.isEmpty());

        st.push("anjali");
        st.push("Raghav");
        st.push("Khushi");
        st.push("Anmol");
        st.push("Chetan");
        System.out.println(st.size());
        System.out.println(st);//A.S = O(n)
        st.pop();
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());//returns the top most element and removes it
        System.out.println(st.size());
    }

    
}
