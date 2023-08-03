import java.util.Scanner;
public class stringbufferexample6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuffer n=new StringBuffer();
        n.append(a);
        System.out.println(n.length());
        System.out.println(n.capacity());
    }
}

