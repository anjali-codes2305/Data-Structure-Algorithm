package Arrays;

public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        int[]a ={1,3,5,6,7};
        int[]b ={2,12,23,45,67,89,99};
        int[]c =new int[a.length +b.length];
        for(int ele:c){
                System.out.print(ele +" ");
            }
        
        merge(a,b,c);
            for(int ele:c){
                System.out.print(ele +" ");
            }
    }

    public static void merge(int a[],int b[],int c[]){
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }   
        }
        while(i<a.length){
            c[k++] =a[i++];

        }
        while(j<b.length){
            c[k++] =b[j++];
        }
    }
    
}
