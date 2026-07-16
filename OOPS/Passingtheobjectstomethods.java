package OOPS;

public class Passingtheobjectstomethods {
    public static class Car{
        String name;
        double length;
        int seats;

        void print(){
            System.out.println(name+" "+seats+" "+length );
        }
        
        
    }
    public static void main(String[] args) {
        
        Car c = new Car();
        c.name = "Sonata";
        c.seats = 10;
        c.length = 55;
        
        Car c1 = new Car();
        c1.name = "Maruti";
        c1.seats = 10;
        c1.length = 55;

        c.print();
        change(c1);

    }
    public static void change(Car x){
        x.name ="BMW";
        System.out.println(x.name);  
    }
    
}
