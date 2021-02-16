package day11.poly.car;

public class Main {
    public static void main(String[] args) {
        /*
        Car myCar = new Car();

        myCar.frontLeft = new NexenTire();
        myCar.frontRight = new KumhoTire();
        myCar.rearLeft = new KumhoTire();
         */

        Car s1 = new Sonata();
        Car s2 = new Sonata();
        Car s3 = new Sonata();

//        Sonata[] sonatas = {s1, s2, s3};

        Car k1 = new K5();
        Car k2 = new K5();
        Car k3 = new K5();

        Car m1 = new Malibu();
        Car m2 = new Malibu();
        Car m3 = new Malibu();
        Car m4 = new Malibu();

        Car[] cars = {s1, s2, s3, k1, k2, k3, m1, m2, m3, m4};

        for (Car c : cars) {
            c.run();
        }

        Object[] oArr = {
            1, 3.3, true, "Ddd", new Car(), new Sonata(), cars
        };


        System.out.println("============================");

        Driver Kim = new Driver();
        Kim.drive(m4);

        System.out.println("============================");

        Sonata newCar = (Sonata)Kim.buyCar("소나타");
        Kim.drive(newCar);
        newCar.joinMembership();

        /*
        Car newCar = Kim.buyCar("소나타");
        Kim.drive(newCar);
        ((Sonata)newCar).joinMembership();
         */

    }
}
