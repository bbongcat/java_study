package day16.collection.list;

import java.util.*;

public class ListDelete {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> students = new ArrayList<>(
                Arrays.asList("영웅재중", "최강창민", "시아준수",
                        "믹키유천", "유노윤호"));
        System.out.println("* 우리반 학생들의 별명: " + students);


        while (true) {
            System.out.println("- 삭제할 학생의 별명을 입력하세요! ");
            System.out.print("> ");
            String name = sc.next();
            if (students.contains(name)) {
                students.remove(students.indexOf(name));
                System.out.print("* 삭제 후 정보: " + students);
                break;
            } else {
                System.out.printf("해당 별명(%s)은 존재하지 않습니다.\n", name);
            }
        }
        sc.close();
    }
}
