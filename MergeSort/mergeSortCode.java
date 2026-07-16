package MergeSort;

public class mergeSortCode {
    public static void main(String[] args) {
        int[]arr = {5,2,8,4 ,6,0,3 ,-5,7,8,4};
        mergeSort(arr);
        for(int i =0 ;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int[]arr){
        
        //Step 1 : Create two new sorted arrays
        int n= arr.length;
        if(n==1)return;
        int[]a =new int[n/2]; int []b = new int[n-(n/2)];
        //Step 2 : Copy the values of arr into a and b
        int idx =0;
        for(int i=0;i<a.length ;i++){
            a[i]=arr[idx++];
        }
        for(int i =0;i<b.length ;i++){
            b[i] = arr[idx++];

        }

        //Step 3:recursion magic
        mergeSort(a);
        mergeSort(b);
        //step 4 :merge a and b
        merge(  a,b,arr);

   }

   public static void merge(int []a , int []b ,int[]c){
    int  i =0;int j=0;int k =0;
    while(i<a.length &&j<b.length){
        if(a[i]<=b[j]){
            c[k++] = a[i++];
        }
        else{
            c[k++] = b[j++];
        }
    }
    while(i<a.length){
        c[k++] = a[i++];
    }
    while(j<b.length){
        c[k++] = b[j++];

    }
   }
    
}
