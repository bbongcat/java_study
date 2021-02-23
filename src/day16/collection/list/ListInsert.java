package day16.collection.list;

import java.util.*;

public class ListInsert {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> foods = new ArrayList<>();

        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        while (true) {
            System.out.print("> ");
            String newFood = sc.nextLine(); // nextLine() : 띄어쓰기 포함

            if (newFood.equals("그만")) {
                System.out.println("입력 종료!");
                break;
            }

            foods.add(newFood);

        }

        System.out.println("내가 먹고싶은 음식들: " + foods);
    }
}
