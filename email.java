import java.util.Scanner;
public class email {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(a);
        if (a.contains("com")||(a.contains("in")||(a.contains("net")|| (a.contains("org"))))){
            System.out.println("valid email address");
        }else{
            System.out.println("invalid");
        }
    }
}
