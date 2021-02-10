package day09.encap.good;

public class Main {
    public static void main(String[] args) {

        Cat nabi = new Cat();

        //nabi.weight = -100; - private 클래스이므로 에러남
        nabi.setWeight(-1000);
        nabi.printWeight();
        nabi.setWeight(5.8);
        nabi.printWeight();

        double nabiWeightForPound = nabi.getWeight(true);
        System.out.println("nabiWeightForPound = " + nabiWeightForPound);
        double nabiWeightForKg = nabi.getWeight(false);
        System.out.println("nabiWeightForKg = " + nabiWeightForKg);

    }
}
