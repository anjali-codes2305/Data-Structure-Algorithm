package Stacks;
import java.util.Stack;

public class pushAtBottom {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(10);//bottom
        st.push(20);
        st.push(30);st.push(40);st.push(50);//top
        System.out.println(st);
        int ele = 60;
        pushBottom(st, ele);
        System.out.println(st);

        reverse(st);
        System.out.println(st);

    }
    public static void reverse(Stack<Integer>st){
        if(st.size()==1)return;
        int top = st.pop();
        reverse(st);
        pushBottom(st,top);
    }
    public static void pushBottom(Stack<Integer>st,int ele){
        if(st.size()==0){
            st.push(ele);
            return;

        }
        int top = st.pop();
        pushBottom(st,ele);
        st.push(top);
    }

    
}
