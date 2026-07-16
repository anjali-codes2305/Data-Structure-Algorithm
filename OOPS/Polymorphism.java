package OOPS;

public class Polymorphism {
    public static class dog{
        void speak(){
            System.out.println("bhau bhau");
        }

    }

     public static class cat{
         void speak(){
            System.out.println("meow meow");
        }
        
    }

     public static class pikachu{
         void speak(){
            System.out.println("pika pika");
        }
        
    }

     public static class human{
         void speak(){
            System.out.println("hello hii");
        }
        
    }

    public static void main(String[] args) {
        dog tommy =new dog();
        cat mechan = new cat();
        pikachu p = new pikachu();
        human h = new human();
        tommy.speak();
        mechan.speak();
        p.speak();
        h.speak();

    }
    
}
