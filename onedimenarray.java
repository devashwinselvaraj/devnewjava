import java.util.Scanner;
public class onedimenarray {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        int[] arr=new int[6];
        for (int a=0;a<6;a++)
        {arr[a]= e.nextInt();}for (int a=0;a< arr.length;a++) {
            System.out.println("the element of " + a + ":" + arr[a]);
        }
    }}
