package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_a_queue {
    public static void main(String[] args) {
      Queue <Integer> q = new LinkedList<>();
      Stack<Integer> st = new Stack<>();
      
        q.add(10);q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        int n =q.size(); 
        for(int i =1 ; i<n ;i++){
            st.push(q.remove());
        }
        for(int i =1 ; i<n ;i++){
            q.add(st.pop());
        }
        System.out.println(q);

    }
    
}
