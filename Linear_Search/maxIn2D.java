package Linear_Search;

public class maxIn2D {
    public static void main(String[] args) {
        int [][]arr = {
            {1,2,4},
            {2,3,5,},
            {5,6,7}
        };
        int target = 5;
        int ans = search(arr);
        System.out.println(ans);
    }
    static int search (int arr[][] ){

        int max = Integer.MIN_VALUE;
        for (int row= 0; row< arr.length; row++) {

            for (int col= 0; col < arr[row].length; col++) {
                if(arr[row][col] >max){
                    max = arr[row][col];
                }
                
            }

            
        }
          return max;
    }
    
}
