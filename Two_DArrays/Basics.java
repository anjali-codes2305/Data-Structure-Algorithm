package Two_DArrays;
import java.util.Scanner;
public class Basics {

    public static void main(String[] args) {
        //int[][]arr = new int[3][4];
        //int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][]arr =new int[3][4];
        Scanner sc = new Scanner(System.in);


        for(int i =0 ; i<arr.length ;i++){
            for(int j =0 ;j<arr[0].length ; j++){
                arr[i][j] = sc.nextInt();

            }
            System.out.println();
        }
        
        int maxSum = Integer.MIN_VALUE;
        int  row = -1;

        for(int i =0 ; i<arr.length ;i++){
            int sum =0;
            for(int j =0 ;j<arr[0].length ; j++){
               sum = sum +arr[i][j];
               
            }
            if(sum>maxSum){
                maxSum = sum;
                row = i;
            }
            
        }
        System.out.println(row +" " +maxSum);
    }
    
}
