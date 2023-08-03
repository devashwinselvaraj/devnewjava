import java.util.Scanner;
public class twodimenarray {
    public static void main(String[] args) {
        Scanner w=new Scanner(System.in);
        int i = 0,j=0;System.out.println("enter the element :");
        int[][] twoD = new int[2][2];
        twoD[i][j]=w.nextInt();
        for (i=0;i<2;i++)
        {
            for (j=0;j<2;j++)
        System.out.println("content of 2d array:");
            {
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();
        }
    }
}
