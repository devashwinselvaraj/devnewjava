class bike{
    void model(){
        System.out.println("bike model is : ktm");
    }
}
class Price extends bike{
    void amount(){
        System.out.println("1000000");
    }
}
class color extends  Price{
    void feature(){
        System.out.println("black");
    }
}
public class multiinheritanceeaxmple {
    public static void main(String[] args) {
        color d = new color();
        d.model();
        d.feature();
        d.amount();
    }
}