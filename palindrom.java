import java.util.Scanner;
public class palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s,reverse="";s = sc.nextLine();int length=s.length();
        for (int i=length-1;i>=0;i--) {
             reverse=reverse+ s.charAt(i);}
             if (s.equals(reverse)) {
                 System.out.println(s+" is palindrom");}
             else {
                 System.out.println(s+" is not a palindrom");
             }}}
