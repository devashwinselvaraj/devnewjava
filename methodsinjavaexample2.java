import java.util.Scanner;
public class methodsinjavaexample2 {
    static String votecheck(int age){
        if (age>=18){
            return "Eligible for voting";
        }else {
            return "Not eligible for voting";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        String e=votecheck(a);
        System.out.println(e);
    }
}
