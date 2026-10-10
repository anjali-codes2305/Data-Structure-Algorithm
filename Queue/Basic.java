package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Basic {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);q.add(20);q.add(50);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.remove());
    }
    
}
