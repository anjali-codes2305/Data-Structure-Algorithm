package Sets_Maps;
import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();
        set.add(25);
        set.add(67);
        set.add(9);
        set.add(98);
        set.add(76);
        System.out.println(set.size());
        System.out.println(set.remove(6));
        System.out.println(set.size());
        System.out.println(set.contains(98));
    }
    
}
