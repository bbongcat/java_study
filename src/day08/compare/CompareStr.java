package day08.compare;

import java.util.Scanner;

public class CompareStr {
    public static void main(String[] args) {

        // 사람 객체 생성
        Person kim = new Person("김철수", "5544");
        System.out.println("kim의 pw: " + kim.pw);

        // 새로운 비밀번호를 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("비밀번호: ");
        String inputPw = sc.next();
        sc.close();

        // 기본타입들은 == 비교가 가능, 그러나 String은 기본 타입이 아니므로 == 비교가 불가함.
        // String끼리 비교하면 String 변수에 들어있는 주소값을 비교하게 되어 false가 나온다.
        // equals를 이용해야 주소값을 타고 char배열 안까지 들어가 글자 하나하나 비교함
        System.out.println("== 비교: " + (kim.pw == inputPw));
        System.out.println("equals 비교: " + (kim.pw.equals(inputPw)));
    }
}
