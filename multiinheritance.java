class car{
    void model(){
        System.out.println("car model is kin");
    }
}
class price extends car{
    void amount(){
        System.out.println("10000000000000");
    }
}
class colour extends price{
    void feature(){
        System.out.println("black");
    }
}
public class multiinheritance {
    public static void main(String[] args) {
        colour d = new colour();
        d.model();
        d.feature();
        d.amount();
    }
}
