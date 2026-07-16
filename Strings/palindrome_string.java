package Strings;

public class palindrome_string {
    public static void main(String[] args) {
        String str = "malayalam";

    int i =0;
    int j = str.length()-1;
    
    boolean isPalindrome  = true;
    while(i<j){
        char first = str.charAt(i);
    char last = str.charAt(j);
        if(first!=last){
            isPalindrome=false;
            break;

        }
        i++;
        j--;
    }
    if(isPalindrome==true){
        System.out.println("String is Palindrome");
    }
    else{
        System.out.println("String is not palindrome");
    }


    
    }
}
