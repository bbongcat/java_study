package day08;

public class PhoneMain {

    public static void main(String[] args) {

        // 객체 생성 방법
        Phone myPhone = new Phone();

//        myPhone.model = "갤럭시 S20";
//        myPhone.color = "코발트블루";
//        myPhone.price = 1000000;

        myPhone.powerOn();
        myPhone.showSpec();

        System.out.println("===========================");

        Phone galaxy = new Phone("갤럭시 S20");
        galaxy.showSpec();

        System.out.println("===========================");

        Phone iPhone = new Phone("아이폰 X", "스노우 화이트");
        iPhone.showSpec();

        System.out.println("===========================");

        Phone xiaomi = new Phone("샤오미", "에메랄드", 250000);
        xiaomi.showSpec();

    }
}
