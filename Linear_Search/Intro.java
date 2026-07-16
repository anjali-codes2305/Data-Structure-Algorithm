package Linear_Search;
class Intro {
    public static void main(String[] args) {
        int []nums  = {1,2,4,5,67,89,76,74};
        int target = 10;
        int index  = Search (nums , target);
        System.out.println(index);
        
    }
    //search the element in array : if element found then return index
        //otherwise return -1
        static int Search(int[]arr ,int target){

            if(arr.length==0){
                return -1;
            }

            //loop
            for(int i = 0 ; i<arr.length ;i++){
                int element =arr[i];
                if(element == target)
                return i;
            }

            return -1;

            
        }

}