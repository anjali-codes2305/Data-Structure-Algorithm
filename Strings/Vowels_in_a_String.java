package Strings;
import java.util.Scanner;
public class Vowels_in_a_String {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String x = sc.nextLine();
        int count =0;
        for(int i =0 ; i<x.length();i++){
            char ch =x.charAt(i);
            if(ch =='a'||ch=='e'||ch =='i'||ch=='o'||ch=='u'){
                count++;

            }
        }
        System.out.println(count);
    }
    
}
