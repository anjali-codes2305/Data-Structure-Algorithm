package Binary_Trees;
class Node{
    int val;
    Node right;
    Node left;
    Node(int val){
        this.val = val;
    }

}
public class Basic {
    public static void main(String[] args) {
        Node a =new Node(1);
        Node b =new Node(2);
        Node c =new Node(3);
        Node d=new Node(0);
        Node e =new Node(5);
        Node f =new Node(6);
        Node g=new Node(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right =g;
        //Traversing
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(max(a));
        System.out.println(levels(a));
    }
    public static void preorder(Node root){
        if(root ==null)return;
        System.out.print(root.val+" ");
         preorder(root.left);
        preorder(root.right);
       

    }
    public static void postorder(Node root){
        if(root ==null)return;
        
         postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
       

    }
    public static void inorder(Node root){
        if(root ==null)return;
        
         inorder(root.left);
         System.out.print(root.val+" ");
        inorder(root.right);
       

    }
    public static int size(Node root){
        if(root == null)return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int sum(Node root){
        if(root == null)return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
     public static int product(Node root){
        if(root == null||root.val==0)return 1;
        return root.val*product(root.left)*product(root.right);
    }
    public static int max(Node root){
        if(root == null)return Integer.MIN_VALUE;
        return Math.max(root.val , Math.max(max(root.left),max(root.right)));
    }
    public static int levels(Node root){
        if(root == null)return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    
    
}
