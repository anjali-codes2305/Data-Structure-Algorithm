package OOPS;
 class students{
        String name ;
        private int id;
        double cgpa;
        private void print(){//setterg
            System.out.println(id);
        }
        int setvalue(int x){//setter
            id=x;
            return x;

        }

        void get(){
            print();
        }

    }

public class privatekeyword {
    public static void main(String[] args) {
        students s = new students();
        s.name = "Hemant";
        s.cgpa=9.10;
        s.get();
        s.setvalue(45);
        System.out.println(s.setvalue(45));


        
    }
}
