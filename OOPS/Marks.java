package OOPS;
 class StudentData{
    String name;
    int rno;
    int[]marks;
    StudentData(int[]s){
        marks =s ;

    }

}

public class Marks {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        StudentData s1 =new StudentData(arr);
    s1.marks[4]=56;
    System.out.println(arr[4]);
    }
    
    
}
