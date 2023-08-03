import java.util.Scanner;
import java.util.StringTokenizer;
public class stringtokenexample1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringTokenizer n=new StringTokenizer(a);
    while (n.hasMoreTokens()){
        System.out.println(n.nextToken());
    }
}}
