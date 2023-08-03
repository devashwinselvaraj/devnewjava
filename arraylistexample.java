import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
public class arraylistexample {
    public static void main(String[] args) {
       Scanner sc=new Scanner(in);
        ArrayList<String> a1 = new ArrayList<>();
        String d= sc.nextLine();a1.add(d);
        String e= sc.nextLine();a1.add(e);
       out.println(a1);
        ArrayList<String> a2 = new ArrayList<>();
        String a = sc.nextLine();a2.add(a);
        String b = sc.nextLine();a2.add(b);
        out.println(a2);
        ArrayList<String> a3 = new ArrayList<>();
        String c = sc.nextLine();a3.add(c);
//        String f = sc.nextLine();a3.add(f);
        out.println(a3);
//        a1.remove(1);
//        out.println(a1);
//        a1.set(1,f);
//        out.println(a1);
//        System.out.println(a1.get(1));
//        a2.addAll(1,a3);
//        System.out.println(a2);
//        a1.retainAll(a2);
//        System.out.println(a1);
//        System.out.println(a2.isEmpty());
        a1.removeAll(a1);
        out.println(a1);
    }
}