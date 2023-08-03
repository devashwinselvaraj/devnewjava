import java.util.Scanner;
public class stringbufferexample5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuffer n=new StringBuffer(a);
        n.delete(1,2);
        System.out.println(n);
    }
}

