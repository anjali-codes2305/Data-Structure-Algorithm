package OOPS;

import java.util.Scanner;
public class UserDefinedDataType {
    public static class Student{
        String name ;
        int id;
        double cgpa;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Student s1=new Student(); 
        s1.name ="Anjali";
        s1.id = sc.nextInt();
        s1.cgpa= 9.1;

        Student s2 = new Student();
        s2.name ="Khushi ";
        s2.id = 11;
        s2.cgpa = 8.9;
        System.out.println(s1.name);
        s2.cgpa =9.9;
        System.out.println(s2.cgpa);

    }
    
}
