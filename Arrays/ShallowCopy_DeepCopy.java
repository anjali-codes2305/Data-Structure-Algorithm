package Arrays;
import java.util.Arrays;
public class ShallowCopy_DeepCopy {

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int[]x=arr;
        x[2]=90;
        System.out.println(arr[2]);

        //DeepCopy
        int arr1[]={1,2,4,5};
        int[]Deep = Arrays.copyOf(arr1,arr1.length);
        Deep[2]=79;
        System.out.println(Deep[2]);
        System.out.println(arr1[2]);

        //Sort
        int[] arr2={5,1,9,8,6};
        print(arr);
        Arrays.sort(arr);
        print(arr);



    }
    public static void print(int[]arr){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    

}
