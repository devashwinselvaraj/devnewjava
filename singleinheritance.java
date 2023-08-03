import java.util.Scanner;
class animal {//superclass
    String name;
    public void dispaly() {
        System.out.println("i can sleep");
    }}
class dog extends animal {//subclass
        public void sound(){
            System.out.println("my name is : "+name);
        }
    }
public class singleinheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        dog d = new dog();
        d.name  = sc.nextLine();
        d.sound();
        d.dispaly();
    }
}
