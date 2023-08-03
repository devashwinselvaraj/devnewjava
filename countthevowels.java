import java.util.Scanner;
public class countthevowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int c=0;
        for (int i=0;i<n.length();i++){
            if (n.charAt(i)==('a')||n.charAt(i)==('e')||n.charAt(i)==('i')||n.charAt(i)==('o')||n.charAt(i)==('u')){
                c++;
            }
        }System.out.println(c);
    }
}
