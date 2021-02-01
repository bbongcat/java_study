package day02;

public class BitOperator {

    public static void main(String[] args) {

        // 비트 반전 연산자
        // 자바에선 거의 쓸 일 없음
        byte x = 8;
        System.out.println("~x = " + ~x);

        // 비트 연산 (2항) - 마찬가지로 쓸 일 거의 없음. 가끔 정처기에 나오는 정도
        byte a = 5;         // 00000101
        byte b = 3;         // 00000011

        // & -> 논리곱 : 각 자리수를 곱하라
        System.out.println(a & b); // 0000 0001 -> 1

        // | -> 논리합 : 각 자리수를 더해라, 단 1+1은 1이다.
        System.out.println(a | b); // 0000 0111 -> 7

        // ^(캐럿) -> 배타적 논리합 : 다르면 1, 같으면 0
        System.out.println(a ^ b); // 0000 0110 -> 6
    }
}
