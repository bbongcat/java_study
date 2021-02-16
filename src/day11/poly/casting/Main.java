package day11.poly.casting;

public class Main {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.method1();
        p.method2(); //부모 객체의 원본 메서드가 나옴(재정의된 메서드X)
        //p.method3(); //부모는 자식 객체의 메서드를 가져오지 못함

        System.out.println("===============================");

        Parent c = new Child();
        c.method1();
        c.method2();
        ((Child)c).method3();
    }
}
