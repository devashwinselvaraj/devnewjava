import java.util.Scanner;
public class printthevowels {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String n=sc.nextLine();
            for (int i=0;i<n.length();i++){
                if (n.charAt(i)==('a')||n.charAt(i)==('e')||n.charAt(i)==('i')||n.charAt(i)==('o')||n.charAt(i)==('u')){
            System.out.println("vowels : " +n.charAt(i)+" in the position : "+i);
        }
    }}}
