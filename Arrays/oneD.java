package Arrays;
import java.util.*;
import java.util.Scanner;
public class oneD {

    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);

        
        
        String []arr = new String[5];
        for(int i =0 ; i< arr.length ; i++ ){
            arr[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr));
       // for(int i =0 ; i<5 ; i++){
           // System.out.println(arr[i]);
        //1 2 }
        //for(String num:arr){
            //System.out.println(num);
        //}
         



    }
    
}
