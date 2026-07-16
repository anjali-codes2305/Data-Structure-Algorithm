package Linear_Search;

public class evendigits {

    public static void main(String[] args) {
        int nums [] = {12 , 345,2,6,7896};
        System.out.println(findNumbers(nums));
        
    }
    static int findNumbers(int[] nums) {
        int count = 0 ;
        for(int num :nums){
            if(evendigits(num)){
                count++;
            }


        }
        return count;


    
}
    static boolean evendigits(int num){
        int numberOfDigits =digits(num);
        return numberOfDigits%2==0;


    }
    static int digits(int num){
        if(num ==0){
            return 1;
        }
        if(num < 0){
            num = num * -1;
        }

        int count = 0 ;
        while (num>0){
            count ++;
            num = num/10;
        }
        return count;

    }
}
