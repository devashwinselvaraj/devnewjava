import java.util.Scanner;
public class outercalss{
    void my_method(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        class method1{
            public void print(){
                System.out.println("The value is : "+a);
            }
        }
        method1 in=new method1();
        in.print();
        }
    public static void main(String[] args) {
        outercalss d=new outercalss();
        d.my_method();
    }
        }

