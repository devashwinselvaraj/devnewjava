import java.util.Scanner;
public class methodsinjavaexample1 {
    public static void agent(String name){
        System.out.println("agent "+name);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        agent(a);
    }}
