package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_k_Elements {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
      Stack<Integer> st = new Stack<>();
      
        q.add(10);q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);

        int k = 3;
        int n =q.size(); 
        for(int i =1 ; i<=k ;i++){
            st.push(q.remove());
        }
        for(int i =1 ; i<=k;i++){
            q.add(st.pop());
        }
        for(int i =1;i<=n-k;i++){
            q.add(q.remove());
        }
        System.out.println(q);

    }
    
    }
    

