package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {
    public static void main(String[] args) {

        String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 변경 전 정보: " + Arrays.toString(tvxq));

        Scanner sc = new Scanner(System.in);

        int idx;

        while (true) {

            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.print("> ");
            String searchMember = sc.nextLine();

            for (idx = 0; idx < tvxq.length; idx++)
                if (searchMember.equals(tvxq[idx])) break;

            if (idx == tvxq.length) {
                System.out.println("해당 이름은 존재하지 않습니다.");
                continue;
            } else {
                System.out.printf("%s의 별명을 변경합니다.\n", tvxq[idx]);
                System.out.print("> ");
                String modifyMember = sc.nextLine();

                tvxq[idx] = modifyMember;
                System.out.println("변경 완료!");
                System.out.println("* 변경 후 정보: " + Arrays.toString(tvxq));
                break;
            }
        }
        sc.close();
    }
}
