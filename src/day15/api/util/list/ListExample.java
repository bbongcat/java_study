package day15.api.util.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        //String[] strs = new String[100];

        List<String> sList = new ArrayList<>();

        String str1 = "멍멍이";
        String str2 = "야옹이";

        // list에 객체를 추가: add(추가할 객체)
        sList.add(str1);
        sList.add(str2);
        sList.add("짹짹이");
        sList.add("개굴이");
        sList.add("어흥이");
        sList.add("야옹이");

        System.out.println("sList = " + sList);

        // list에 저장된 객체 수 확인: size()
        int size = sList.size();
        System.out.println("저장된 객체 수: " + size);

        // list에 객체 삽입: add(index, 객체)
        sList.add(2, "콩벌레");
        System.out.println("sList = " + sList);

        // list에 객체 수정: set(index, 수정 객체)
        sList.set(3, "메롱이");
        System.out.println("sList = " + sList);

        // list에 객체 삭제: remove(index)
        sList.remove(6);
        System.out.println("sList = " + sList);

        sList.remove("개굴이");
        sList.remove(str1);
        System.out.println("sList = " + sList);

        // list에 저장된 객체 참조하기: get(index)
        String data = sList.get(2);
        System.out.println("data = " + data);

        System.out.println("======================");

        // list의 반복문 처리
        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }
        System.out.println("=============================");

        for (String s : sList) {
            System.out.println(s);
        }

        System.out.println("=============================");

        // list에 저장된 객체의 인덱스 얻기: indexOf(객체)
        int idx = sList.indexOf("어흥이");
        System.out.println("어흥이의 인덱스: " + idx);

        // list에 저장된 객체 유무 확인: contains(객체)
        System.out.println(sList.contains("콩벌레"));
        System.out.println(sList.contains("귀뚜라미"));
        System.out.println(!sList.contains("어흥이"));

        // list 내부 객체 전체 삭제: clear()
        sList.clear();
        System.out.println("sList = " + sList);
        System.out.println("size = " + sList.size());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(45);
        numbers.add(75);
        numbers.add(12);
        numbers.add(63);
        System.out.println("numbers = " + numbers);

        // Object 리스트. 타입에 상관없이 담을 수 있으나 관리 상 비추천
        List<Object> objList = new ArrayList<>();

        // 초기 값들이 들어있는 리스트 생성법
//        List<Integer> numberList = Arrays.asList(50, 60, 85, 30, 10, 40);
        List<Integer> numberList = new ArrayList<>(Arrays.asList(
                50, 60, 85, 30, 10, 40));
        System.out.println("================================");
        numberList.add(100);
        System.out.println("numberList = " + numberList);

        // 오름차 정렬
        numberList.sort(Integer::compareTo);
        System.out.println("numberList = " + numberList);

        // 내림차 정렬
        numberList.sort(Comparator.reverseOrder());
        System.out.println("numberList = " + numberList);

        // List가 비었는지 확인 : isEmpty()
        List<Integer> empty = new ArrayList<>();
        System.out.println(empty.isEmpty());

    }
}
