package Recursion;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int []arr ={1,2,4,5,7};
        
        System.out.println(recPrint(arr,0 , 56));
    }
    public static boolean recPrint(int[] arr , int idx , int target){
        if( idx == arr.length)return false;
        if(arr[idx]==target )return true;
        
       return recPrint(arr, idx+1 , target);

    }
    // public static void recPrint(int arr[] , int idx){
    //     if(idx == arr.length)return ;
    //     System.out.println(arr[idx]);
    //     recPrint(arr , idx+1);
    // }
    
    //if we want to reverse the array 
    public static void recPrint(int[]arr , int idx){
        if(idx == arr.length)return;
        recPrint(arr,idx+1);
        System.out.println(arr[idx]);
    }
    
}
