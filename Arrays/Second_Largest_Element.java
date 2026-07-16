package Arrays;

public class Second_Largest_Element {
    public static void main(String[] args) {
        int []arr ={2,4,5,6,7};
        int firstMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstMax){
                firstMax =arr[i];

            }

        }
        int secondMax=Integer.MIN_VALUE;
        for(int i =0;i<arr.length ;i++){
            if(arr[i]>secondMax&& arr[i]!=firstMax){
               secondMax =arr[i];
                
            }
        }
        System.out.println(secondMax);

    }
    
}
