package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class At_a_Position {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(10);q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        int ele = 60;
        int idx = 2;
        int n =q.size();
        for(int i =1 ;i<=idx ;i++ ){
            q.add(q.remove());
        }
        q.add(ele);
        for(int i =1; i <=n-idx ; i++){
            q.add(q.remove());

        }
        System.out.println(q);
        int n1 =q.size();

        //peek at a position
        for(int i =1 ;i<=idx ;i++ ){
            q.add(q.remove());
        }
        System.out.println(q.peek());

        for(int i =1; i <=n1+1-idx ; i++){
            q.add(q.remove());

        }
        System.out.println(q);

        //delete at a position
         for(int i =1 ;i<idx ;i++ ){
            q.add(q.remove());
        }
        q.remove();

        for(int i =1; i <=q.size()-idx ; i++){
            q.add(q.remove());

        }
        System.out.println(q);


    }
    
}
