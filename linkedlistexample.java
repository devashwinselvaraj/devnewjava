import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class linkedlistexample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        LinkedList<String> a1 = new LinkedList<>();
        String d= sc.nextLine();a1.add(d);
        String da= sc.nextLine();a1.add(da);
        String db= sc.nextLine();a1.add(db);
        String dq= sc.nextLine();a1.add(dq);
        String dw= sc.nextLine();a1.add(dw);
        String ed= sc.nextLine();a1.add(ed);out.println(a1);
        a1.removeFirst();out.println(a1);
        a1.removeLast(); out.println(a1);
        a1.removeFirstOccurrence(dw); out.println(a1);
        a1.removeLastOccurrence(da); out.println(a1);
        a1.removeIf(str->str.contains("g"));out.println(a1);
}
}
