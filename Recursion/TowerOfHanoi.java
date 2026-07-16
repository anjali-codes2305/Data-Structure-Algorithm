package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }
    public static void hanoi(int n ,char A ,char B,char C){
        if(n==0)return;
        //n-1 disks from A to b via c
        hanoi (n-1 , A ,C,B);
        //largest from A to C
        System.out.println(A+"->"+C);
        //n-1 from B to C via A
        hanoi(n-1 , B,A,C);
    }
    
}
