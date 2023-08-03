import java.util.Scanner;
    public class methodsinjavaexample3 {
        static String maxmini(int x){
            if (x<100){
                return "minimum";
            }else {
                return "maximum";
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a= sc.nextInt();
            String e=maxmini(a);
            System.out.println(e);
        }
    }


