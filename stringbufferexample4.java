import java.util.Scanner;
public class stringbufferexample4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuffer n=new StringBuffer(a);
        n.reverse();
        System.out.println(n);
    }
}
