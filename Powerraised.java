import java.util.Scanner;
public class Powerraised {

    //a raised to the power b
    public static void main(String[] args) {
        //by loops
        // int a =2;
        // int b =5;
        // int ans  =1;
        // for(int i =0;i<b;i++){
        //     ans =ans*a;
        // }
        // System.out.println(ans);

        //by recursion
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value");
        int a =sc.nextInt();
        System.out.println("Enter the power value");
        int b =sc.nextInt();
        System.out.println("the a raised to the power b is "+pow(a,b));


    }
    // public static double pow(double a ,double b ){
    //     if(b==0)return 1;
    //     return a*pow(a,b-1);

    public static int pow(int a , int b ){
        if(b==0)return 1;
        int call = pow(a,b/2);
        if(b%2==0)return call*call;
        else return call*call*a;


    }




        
    }

