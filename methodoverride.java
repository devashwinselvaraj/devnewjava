import java.util.Scanner;
class pet {//superclass
    String name;
    public void dispaly() {
        System.out.println("i can sleep");
    }}
class cat extends pet {//subclass
    public  void dispaly(){
        super.dispaly();
        System.out.println("i can eat");
    }
    public void sound(){
        System.out.println("my name is : "+name);
    }
}
public class methodoverride {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        cat d = new cat();
        d.name  = sc.nextLine();
        d.sound();
        d.dispaly();
    }
}