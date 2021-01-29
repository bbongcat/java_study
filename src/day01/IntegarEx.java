package day01;

public class IntegarEx {

    public static void main(String[] args) {

        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 2147483647000L; 
        //정수 리터럴은 기본으로 int로 받기 때문에 int의 범위를 벗어나 에러가 난다.
        // 뒤에 대문자 L을 붙여주면 long 타입으로 받아서 해결됨
        System.out.println("d = " + d);

    }
}
