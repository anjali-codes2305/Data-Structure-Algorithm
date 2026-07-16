package Objects_Classes;

public class Books_Price {
    int standard;
    String subjectName;
    
    void Books(){
        System.out.println("The price of "+ subjectName + "of "+standard + "is 500");
    }

    public static void main(String[] args) {
        Books_Price price = new  Books_Price();
        price.standard = 7;
        price.subjectName = "Hindi";
        price.Books();
    }
    
}
