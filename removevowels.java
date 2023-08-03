import java.util.Scanner;
public class removevowels{
    static boolean isVowel (char c)
    {
        return(c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u');
    }
    static void removeVowel (String x){
        System.out.print(x.charAt(0));
        for (int i=1;i<x.length();i++){
            if ((!isVowel(x.charAt(i)))||(!isVowel(x.charAt(i-1)))){
                System.out.print(x.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        removeVowel(x);
    }
}
