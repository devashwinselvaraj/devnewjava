import java.util.Scanner;
public class methodinjavamyownexample {
    static void method1(String name){
        System.out.println("Name : "+name);
    }

    static void method2(int age) {
        System.out.println("age : "+age);
    }

    static void method3(long nub) {
        System.out.println("Phone no. : "+nub);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        method1(a);
        int b= sc.nextInt();
        method2(b);
        long c=sc.nextLong();
        method3(c);
    }
}
