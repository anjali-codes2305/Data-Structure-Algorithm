package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class Traversing {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(10);q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        int n =q.size();
        for(int i =1 ; i<=n;i++){
            System.out.print(q.peek());
            q.add(q.remove());
        }

        System.out.println(q);
    }
    
}
