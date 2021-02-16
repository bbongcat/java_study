package day11.final_.field;

public class Korean {

    public String name; // 이름

    // 상수: 유일하고 불변한 값 ( static final 을 붙여 쓴다, 관례적으로 대문자로 작성 )
    public static final String NATION = "대한민국"; // 국적

    // 주민번호는 한 번 정해지면 변하지 않으므로 final만 붙임
    public final String password; // 주민번호

    // final을 붙이려면 초기화를 해야 하므로 아래와 같이 초기화 해줌
    public Korean(String password) {
        this.password = password;
    }
}
