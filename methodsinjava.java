import java.util.Scanner;
public class methodsinjava {
    public static void print(){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println(a);
        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(x-y);

    }
    public static void main(String[] args) {
     print();
    }
}
