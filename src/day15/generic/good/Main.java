package day15.generic.good;

public class Main {

    public static void main(String[] args) {

        Basket<Apple> ab = new Basket<Apple>();
        ab.setFruit(new Apple());
        System.out.println(ab.getFruit());

        Basket<Peach> pb = new Basket<Peach>();
        pb.setFruit(new Peach());
        System.out.println(pb.getFruit());

        //Basket<Water> wb = new Basket<>();
    }
}
