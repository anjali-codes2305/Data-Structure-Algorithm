package OOPS;
 class Car{
        String name;
        double length;
        int seats;
        
        Car(String name , double length,int seats){//paramtrized constructor
            this.name =name;
            this.length =length;
            this.seats =seats;
        }
        Car(){

        }
        void print(){
            System.out.println(name+" "+length+" "+seats);
        }
            
    }

public class Constructors {
    public static void main(String[] args) {
        Car c = new Car("sonata " , 3.45,4);
    c.print();

    }
    
}
