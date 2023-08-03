interface sam{
    void print();
    default void msg(){
        System.out.println("Default life");
    }
}
/*
interface dev // extends sam{void display();}
 */
class multiple implements sam//,dev
         {
    public void priya(){
        System.out.println("thugged life");
    }
    /*
    public void display(){System.out.println("Rugged life");}
     */
    @Override
    public void print() {
    }
}
public class multiinterface {
    public static void main(String[] args) {
        multiple m=new multiple();
       // m.display();
        m.priya();
        m.msg();
    }
}
