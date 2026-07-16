package Basic_Sorting;

public class Insertion_Sort{
    public static void main(String[] args) {
        int[]arr = {3,2,5,7,6,8,7};
        int n = arr.length;
        for(int i =1 ;i<n ; i++){

            int j =i ;
            while(j>0 &&arr[j]<arr[j-1]){
                int temp  =arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
            
        }

        for(int ele :arr){
            System.out.println(ele);
        }

    }

} 