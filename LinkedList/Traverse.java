package LinkedList;
public class Traverse {
    public static void displayRecursion(Node head){
        Node temp =head;
        if(temp==null)return;
        System.out.print(temp.val+" ");
        displayRecursion(temp.next);
        
    }
    public static void display(Node head){
        //Node temp =head;
        // while(temp!=null){
        //     System.out.print(temp.val +" ");
        //     temp =temp.next;
        // }
        for(Node temp =head ; temp!=null ;temp =temp.next){
            System.out.print(temp.val+" ");
        }

    }

    public static void get(Node head ,int idx){
        Node temp =head;         
        for(int i =1 ;i<=idx ;i++){
            temp =temp.next;

            
        }
        System.out.println(temp.val);

    }
     public static void main(String[] args) {

        Node a =new Node(10); a.val = 10;
        Node b=new Node(20);b.val=20;
        Node c=new Node(30);c.val =30;
        Node d=new Node(40);d.val =40;
        Node e=new Node(50);e.val=50;
        Node f =new Node(60);
        a.next=b;
        b.next =c;
        c.next =d;
        d.next=e;
        e.next =f;
        // display(a);
        // System.out.println();
        // displayRecursion(a);
        get(a ,2);


    
}
}
