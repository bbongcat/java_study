package day11.poly.player;

public class Warrior extends Player {

    int rage;

    // 생성자
    public Warrior(String name) {
        super(name, 1, 50);
    }

    void rush() {
        System.out.println(this.name + "님이 돌진합니다.");
    }

    // 메서드 오버라이딩
    @Override // 오버라이딩 검증 아노테이션
    void info() {
        super.info();  // Player 파일의 info를 불러옴
        System.out.println("# 분노: " + this.rage);

    }


}
