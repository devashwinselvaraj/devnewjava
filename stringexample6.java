public class stringexample6 {
    public static void main(String[] args) {
        String s1="dev";
        String s2="DEV";
        String s3="oi";
        String s4="oi";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s2.equalsIgnoreCase(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
    }
}
