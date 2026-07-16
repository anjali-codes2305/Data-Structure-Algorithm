package Printing_Questions;
import java.util.Scanner;

public class Star {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no. of rows");
        int n = sc.nextInt();
        System.out.println("enter number of columns");
        int m = sc.nextInt();
        for(int i =1 ; i<=n ; i++){
            for(int j =1 ; j<=m ; j++){
                System.out.print("*");
            }
            System.out.println("  ");
        }


        //Hollow square star printing
        for(int i =1 ; i<=n;i++){
            for(int j = 1 ;j<=m;j++){
                if(i==1||i==n||j==1||j==m){
                    System.out.print("* ");
                }
                
            }
            
            System.out.println("       ");
                
        }

        //Half pyramid
        for(int i = 1 ;i<=n;i++){
            for(int j =1 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //inverted half pyramid
        for(int i =1;i<=n;i++){
            for(int j =n ;j>=i;j--){
                System.out.print("*");

            }
            System.out.println(" ");
            
        }

        // inverted half pyramid rotated by 180
        for(int i =1 ;i<=n;i++){ //i=1
            for(int j =1; j<=n-i;j++){ //
                System.out.print(" ");

                for( j=1;j<=i;j++){
                System.out.print("* ");
            }
            }
            

            System.out.println(" ");
        }

    }

    
}

