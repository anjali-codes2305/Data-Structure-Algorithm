 
 package Objects_Classes;
 import java.util.Scanner;
 class Primecheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//how many numbers we want to check;
        for(int i = 1 ; i<= t ; i++){
            int n = sc.nextInt();
            int count = 0;
            for(int div = 2 ;div*div<=n;div++){
                if(n%div==0){
                    count++;
                }
                if(count==0){
                    System.out.println("number is prime");
                }
                else{
                    System.out.println("number is not prime");
                }
            }
        }
    }

}