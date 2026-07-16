package Arrays;

public class Passingvalueinmethods {

    public static void change(int[]arr){
        arr[2]=5;
    }
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5};
        change(arr);
        System.out.println(arr[2]);
    }
    
}
