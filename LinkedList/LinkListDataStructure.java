package LinkedList;
class Node{
    int val ;
    Node next;
    Node(int val){
        this.val =val;
    }
}
class Linklist{
    Node head=null;
    Node tail =null;
    int size;
     void insertAtTail(int val) {
        Node temp =new Node(val);
        if(head==null)head =tail =temp;
        else{
            tail.next=temp;
            tail =temp;
            size++;
        }
        
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
            if(head==null) head =tail =temp;

            else{
                 temp.next =head;
            head =temp;
            size++;

            }
        
    }
    void deleteAtHead(){
        if(head ==null){
            System.out.println("List is empty");
        }
        else{
            head =head.next;
            size--;

        }
        
    }
    public int search (int val){
        if(head ==null)return -1;
        Node temp = head;
        int idx =0;
    while(temp !=null){
         
        if(temp.val ==val)return idx;
        temp =temp.next;
        idx++; 

    }
    return -1;   
       
    }
    void insert(int idx ,int val){
        
        if(idx<0||idx>size)System.out.println("Invalid index");
        else if(size==0)insertAtHead(val);
        else if(idx==size)insertAtTail(val);
        else{
            Node temp =head;
            for(int i =1 ;i<=idx-1;i++){
                
            temp =temp.next;
        }
        Node t = new Node(val);
        t.next =temp.next;
        temp.next =t;
        size++;

        }
        
    }
    void delete(int idx){
        if(idx<0 ||idx>=size){
            System.out.println("INvalid index");
            return;
        }

        if(idx ==0)deleteAtHead();

        
        Node temp =head;
        for(int i =1 ;i<=idx-1;i++){
            temp =temp.next;
        }
        temp.next =temp.next.next;
        if(idx ==size-1)tail =temp;
        size--;
            
        
    }


    void display(){
        Node temp =head;
        if(temp==null)return;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp =temp.next;
        }
        System.out.println();

    }

}
public class LinkListDataStructure {
    public static void main(String[] args) {
        Linklist ll = new Linklist();
    ll.insertAtTail(60);
    ll.insertAtTail(40);
    ll.insertAtTail(30);
    ll.insertAtTail(90);
    ll.display();
    ll.insertAtHead(50);
    ll.display();
    ll.deleteAtHead();
    ll.display();
     System.out.println(ll.size);
     System.out.println(ll.search(30));
     ll.insert(2,45);
     ll.display();
     ll.delete(3);ll.display();
     


    }

    
}
