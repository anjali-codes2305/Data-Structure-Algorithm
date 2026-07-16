class palindrome{
    public static void main(String[] args) {
        
        String str= "Anjali";
        int i = 0;
        int j = str.length()-1;
        boolean isPalindrome = true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                isPalindrome  = false;
                break;
                

                
            }  
            i++;
            j--;

    }
    if(isPalindrome==true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}