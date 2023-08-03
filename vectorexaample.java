import java.util.Scanner;
import java.util.Vector;
import static java.lang.System.out;
public class vectorexaample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector<String> a1=new Vector<>();
        String d= sc.nextLine();a1.add(d);
        String da= sc.nextLine();a1.add(da);
        String db= sc.nextLine();a1.add(db);
        String dq= sc.nextLine();a1.add(dq);
        String dw= sc.nextLine();a1.add(dw);
        String ed= sc.nextLine();a1.add(ed);
        String edf= sc.nextLine();a1.add(edf);
        String edg= sc.nextLine();a1.add(edg);
        String edh= sc.nextLine();a1.add(edh);
        String edj= sc.nextLine();a1.add(edj);
        String edk= sc.nextLine();a1.add(edk);
        String edl= sc.nextLine();a1.add(edl);
        String edo= sc.nextLine();a1.add(edo);
        a1.ensureCapacity(30);
        out.println(a1.capacity());
    }
}
