package Linear_Search;
import java.util.*;

public class searchInString {
     public static void main(String[] args) {
        String name = "Anjali";
        char target = 'k';
        //boolean index = Search (name , target);
       // System.out.println(index);
       System.out.println(Arrays.toString(name.toCharArray()));

        
     }

     static boolean Search2(String str , char target){
        if(str.length()==0){
            return false;
        }
        for(char ch :str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;

     }



     static boolean Search(String str , char target){
        if(str.length()==0){
            return false;
        }
        for(int i = 0 ; i<str.length();i++){
            if(target == str.charAt(i)){
                return true; 

            }
        }
        return false;

     }

}
