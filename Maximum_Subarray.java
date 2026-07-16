public class Maximum_Subarray {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
        int maxSum = Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length ; i++){
            int currSum = 0;
            for(int j = i;j<arr.length ; j++){
                currSum += arr[j];
                maxSum = Math.max(currSum , maxSum);
            }
        }
        System.out.println(maxSum);
    }
}
