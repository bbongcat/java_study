package day12.abs.good;

public class JuicySeoul extends Juicy {

    @Override
    public void orderAppleJuice() {
        System.out.println("사과 쥬스의 가격은 3,000원입니다.");
    }

    @Override
    public void orderGrapeJuice() {
        System.out.println("포도 쥬스의 가격은 2,800원입니다.");
    }
}
