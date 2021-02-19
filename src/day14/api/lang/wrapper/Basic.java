package day14.api.lang.wrapper;

public class Basic {

    public static void main(String[] args) {

        int a = 100;
        double b = 5.5;
        char c = 'G';
        boolean d = false;

        // Boxing : 기본 데이터를 객체로 변환
        Integer v1 = new Integer(a);
        Double v2 = new Double(b);
        Character v3 = new Character(c);
//        String v4 = new String("hello");

        // AutoBoxing : new연산자를 생략하고 객체로 변환 (원래는 위처럼 써야함)
        Integer x1 = a;
        Double x2 = 3.14;
        Character x3 = 'x';

        // Object 배열에 기본 타입인 실수 정수 등이 들어가는 이유:
        // AutoBoxing 되어 객체 타입으로 배열에 들어갔기 때문
        Object[] arr = {v1, v2, 100, 300, 3.1};


        // 문자열을 기본타입으로 변환 가능
        // Wrapper클래스명.parse+기본타입명(변환할 문자명)
        String s1 = "10";
        String s2 = "3.14";

        int x = Integer.parseInt(s1);
        double y = Double.parseDouble(s2);
        System.out.println(x + y);

        try {
            Integer.parseInt("메롱메롱");
        } catch (NumberFormatException e) {
            System.out.println("변환 불가능한 문자열입니다.");
        }
    }
}
