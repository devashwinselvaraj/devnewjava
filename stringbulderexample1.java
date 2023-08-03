import java.util.Scanner;
public class stringbulderexample1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuilder n =new  StringBuilder(a);
        n.reverse();System.out.println(n);}}
