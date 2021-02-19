package day14.api.lang.string;

import java.util.Arrays;
import java.util.Locale;

public class StringManipulation {

    public static void main(String[] args) {

        String s1 = "hello java";

        // charAt(index) : 문자열의 특정 인덱스 문자 리턴
        char c = s1.charAt(4);
        System.out.println("4번 인덱스 문자값: " + c);

        // substring(index) : 문자열 잘라내기
        String result = s1.substring(6); //6번 인덱스부터 끝까지 잘라냄
        System.out.println(result);
        // substring(시작 인덱스, 끝 인덱스) : 시작 인덱스부터 끝 인덱스 전 글자까지 잘라서 반환
        result = s1.substring(0, 5);
        System.out.println(result);

        int length = s1.length();
        System.out.println("총 글자 수: " + length);

        int idx = s1.indexOf("o");
        System.out.println("o의 인덱스: " + idx);

        idx = s1.indexOf("java");
        System.out.println("java의 첫글자 인덱스: " + idx);

        idx = s1.indexOf("메롱");
        System.out.println("없는 글자의 인덱스: " + idx);

        System.out.println("l의 위치(앞에서부터): " + s1.indexOf("l"));
        System.out.println("l의 위치(뒤에서부터): " + s1.lastIndexOf("l"));


        System.out.println("=============================");


        // toLowerCase(), toUpperCase() : 영문 대/소문자 변환
        String fileName = "/upload/2021/02/19/야옹이는_못말려.JPEG";
        String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
        System.out.println("확장자명: " + ext);

        // 이미지 파일인지 확인하기
        switch (ext.toLowerCase()) { // 대문자 확장자도 소문자로 바꿔서 검증
            case "jpg": case "gif": case "png": case "jpeg":
                System.out.println("이미지 파일입니다.");
                break;
            default:
                System.out.println("기타 파일입니다.");
        }

        String greeting = "HEllo mY WoRLd";
        System.out.println("=====================");
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.toUpperCase());


        // trim() : 문자열 공백 제거
        String name = "                    김철수          ";
        System.out.println(name.trim() + "님 안녕하세요!");

        // replace("바꿀 문자열", "대체 문자열")
        String java = "java study, java program, java coffee";
        System.out.println(java.replace("java", "자바"));
        System.out.println(java.replace("java ", ""));

        // split() : 문자열을 분리하여 배열로 리턴
        String pet = "멍멍이, 야옹이, 어흥이, 짹짹이";
        String[] pets = pet.split(", ");
        System.out.println(Arrays.toString(pets));

        // valueOf() : 다른 타입 데이터를 문자열로 변환
        int x = 100;
        double y = 55.89;

        System.out.println(x + y);
        System.out.println(String.valueOf(x) + String.valueOf(y));

    }
}
