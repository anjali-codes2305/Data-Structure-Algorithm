package Arrays;

public class program2 {
    public static void main(String[] args) {
     int []arr= {1,2,3,5,67,};
    System.out.println(max(arr)); 

        
    
}

static int max(int[]arr ){
    int maxval = arr[0];
    for(int i = 0 ; i<arr.length; i++){
    if(arr[i ] >maxval){
    arr[i] = maxval;
   
    }
}
 return maxval;
}
}
