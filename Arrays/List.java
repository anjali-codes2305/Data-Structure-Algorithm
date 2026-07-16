package Arrays;
import java.util.*;

public class List {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

     ArrayList<Integer> list = new ArrayList<Integer>();
    /*list.add(2);
     list.add(2);
     list.add(2);

     list.add(2);
     list.add(2);
     list.add(2);
     System.out.println(list);*/

     for(int i = 0 ; i <5; i++){
      list.add( sc.nextInt());
     }
     for(int i = 0 ; i<5 ; i++){
      System.out.println(list.get(i));
     }

     ArrayList<ArrayList <Integer>> list1 = new ArrayList<>();
     for(int i = 0 ; i<3; i++){
      list1.add(new ArrayList< >());

     }
     for(int i = 0 ;i <3 ; i++){
      for(int j =0 ; j<3 ; j++){
        list1.get(i).add(sc.nextInt());
      }
     }
     System.out.println(list1);






   }
    
}
