package day12.question;

public class SnowMain {
    public static void main(String[] args) {

        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.roll();
        tire.roll();
    }
}
