package day12.abs.bad;

public class JuicySeoul extends Juicy {

    @Override
    void orderAppleJuice() {
        System.out.println("사과 쥬스의 가격은 3,500원입니다.");
    }

    @Override
    void orderGrapeJuice() {
        super.orderGrapeJuice();
    }
}
