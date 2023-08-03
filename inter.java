import java.util.Scanner;
interface Vechicle{
    void speed(int a);
    void applybreak(int a);
    void gear(int a);
}
class EBike implements Vechicle{
    int gear;
    int speed;
    public void Gear(int newGear){
        gear =newGear;
    }
    public void printstates(){
        System.out.println("speed : "+speed+"gear"+gear);
    }
    @Override
    public void speed(int a) {
    }
    @Override
    public void applybreak(int a) {
    }
    @Override
    public void gear(int a) {
    }
}
    class ECar implements Vechicle {
        int gear;
        int speed;
        public void Gear(int newGear) {
            gear = newGear;
        }
        public void speedup(int incr) {
            speed = speed + incr;
        }
        @Override
        public void speed(int a) {
        }
        public void applybreak(int br) {
            speed = speed - br;
        }
        @Override
        public void gear(int a) {
        }
        public void printstates() {
            System.out.println("speed : " + speed + "gear" + gear);
        }
    }
        public class inter {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                EBike b = new EBike();
                b.Gear(a);
                b.speed(c);
                b.applybreak(d);
                System.out.println("E-Bike");
                b.printstates();
                Scanner ec = new Scanner(System.in);
                int aj = ec.nextInt();
                int ck = ec.nextInt();
                int dl = ec.nextInt();
                ECar h = new ECar();
                h.Gear(aj);
                h.speedup(ck);
                h.applybreak(dl);
                System.out.println("E-Car");
                h.printstates();
            }
}