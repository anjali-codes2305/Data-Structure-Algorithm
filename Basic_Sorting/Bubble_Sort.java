package Basic_Sorting;

public class Bubble_Sort {
    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele +" ");
        }
    }
    //optimised code
    public static void main(String[] args) {
        int[]arr = {8,6,34,6,5,-1};
        int n =arr.length;
        print(arr);
        // boolean isSorted =true;
        // int swaps =0;
        // for(int k =0 ;k<n-1 ;k++){
        //     for(int i =0;i<n-1-k;i++){
        //     if(arr[i]==0){
        //         int temp =arr[i];
        //         arr[i]=arr[i+1];
        //         arr[i+1] =temp;
        //         swaps++;

        //     }
        // }

        // if(swaps ==0)break;


        // }

        
        for(int i =n-1 ;i>0;i--){
            int max = Integer.MIN_VALUE;
        int maxdx = -1;

            for(int j =0 ;j<=i ; j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxdx=j;
                }
            }

            //swap
            int temp =arr[i];
            arr[i]=arr[maxdx];
            arr[maxdx] =temp; 
        }
        
 

        print (arr);
        
    }
    
}
