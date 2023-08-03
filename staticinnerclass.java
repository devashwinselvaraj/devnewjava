public class staticinnerclass {
    static int num=90;
    static class inner{
        void mm(){
            System.out.println("the value : "+num);
        }
    }
    public static void main(String[] args) {
        staticinnerclass.inner in=new staticinnerclass.inner();
        in.mm();
    }
}
