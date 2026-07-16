package Linear_Search;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = {1,3,4,67,7,3};
        int target = 8 ;
        int start = 2;
        int end = 4;
        int index = Search (arr , target ,start , end);
        System.out.println(index);

    }
     static int Search(int[]arr ,int target ,int start , int end){

            if(arr.length==0){
                return -1;
            }

            //loop
            for(int i = start ; i<end ;i++){
                int element =arr[i];
                if(element == target)
                return i;
            }

            return -1;

            
        }

    
}
